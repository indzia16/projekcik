/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dedio.czwarty;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dedio.czwarty.Wersor;
import dedio.czwarty.Widok;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Indzia
 */
public class Kontroler 
{
    private Wersor wersor;
    private Widok  widok;
    

    public Kontroler(Wersor wersor, Widok widok) 
    {
        this.wersor = wersor;
        this.widok  = widok;

        this.widok.addMultiplyListener(new Kontroler.MultiplyListener());
        this.widok.addClearListener(new Kontroler.ClearListener());
    }

    class MultiplyListener implements ActionListener 
    {
       
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource() == widok.Wersory)
            {
                widok.append("\n********************************************************************************************************************\n");
                widok.append("\t\t     ---------------- WEKTORY ----------------\n");
                widok.append("********************************************************************************************************************\n");
                Wersor[] tab = new Wersor[10];
        
        
                tab[0]  = new Wersor(1,0,0);
                widok.append(tab[0].about_wersor()); 
                tab[1]  = new Wersor(0,0,5);
                widok.append(tab[1].about_wersor());     
                tab[2]  = new Wersor(4,0,0);
                widok.append(tab[2].about_wersor());      
                tab[3]  = new Wersor(0,7,0);
                widok.append(tab[3].about_wersor());     
                tab[4]  = new Wersor(0,0,2);
                widok.append(tab[4].about_wersor()); 
                tab[5]  = new Wersor(8,0,0);
                widok.append(tab[5].about_wersor()); 
                tab[6]  = new Wersor(3,0,0);
                widok.append(tab[6].about_wersor()); 
                tab[7]  = new Wersor(0,1,0);
                widok.append(tab[7].about_wersor()); 
                tab[8]  = new Wersor(0,0,9);
                widok.append(tab[8].about_wersor()); 
                tab[9]  = new Wersor(6,0,0);
                widok.append(tab[9].about_wersor()); 
            }
            else if(e.getSource()== widok.OpW)
            {
                Wersor[] tab = new Wersor[10];
                tab[0]  = new Wersor(1,0,0);
                tab[1]  = new Wersor(0,0,5);    
                tab[2]  = new Wersor(4,0,0);     
                tab[3]  = new Wersor(0,7,0);    
                tab[4]  = new Wersor(0,0,2);
                tab[5]  = new Wersor(8,0,0);
                tab[6]  = new Wersor(3,0,0);
                tab[7]  = new Wersor(0,1,0);
                tab[8]  = new Wersor(0,0,9);
                tab[9]  = new Wersor(6,0,0);
                
                widok.append("\n********************************************************************************************************************\n");
                widok.append("\t               ---------------- OPERACJE NA WEKTORACH ----------------\n");
                widok.append("********************************************************************************************************************\n");
        
                widok.append("\t\t                   * DODAWANIE * \n");
                widok.append(tab[0].wypisz1());
                widok.append(tab[1].wypisz1());
                tab[0].dodaj(tab[1]);
                widok.append("\t\t                            Wynik \n");
                widok.append(tab[0].wypisz1());

                widok.append("\n\t\t                * ODEJMOWANIE * \n");
                widok.append(tab[3].wypisz1());
                widok.append(tab[6].wypisz1());
                tab[3].odejmij(tab[6]);
                widok.append("\t\t                            Wynik \n");
                widok.append(tab[3].wypisz1());

                widok.append("\n\t\t                     * MNOZENIE * \n");
                widok.append(tab[8].wypisz1());
                widok.append(tab[4].wypisz1());
                tab[8].pomnoz(tab[4]);
                widok.append("\t\t                            Wynik \n");
                widok.append(tab[8].about_wersor());

                widok.append("\n\t\t        * MNOZENIE I DODAWANIE * \n");
                widok.append(tab[2].wypisz1());
                widok.append(tab[7].wypisz1());
                widok.append(tab[1].wypisz1());
                tab[2].pomnoz(tab[7]);
                tab[2].dodaj(tab[1]);
                widok.append("\t\t                            Wynik \n");
                widok.append(tab[2].about_wersor());

                
            }
            else if(e.getSource() == widok.WyM)
            {   
                widok.append("\n********************************************************************************************************************\n");
                widok.append("\t\t     ---------------- MACIERZE ----------------\n");
                widok.append("********************************************************************************************************************\n");
        
                MacierzOdwr c, d;

                c = new MacierzOdwr(new double [][] {
                                                    {2,1},
                                                    {5, 3}
                                                    }
                                   );

                d = new MacierzOdwr(new double [][] {
                                                    {2,3},
                                                    {1, 4}
                                                    }
                                   );
                widok.append("\t\t                             Macierz 1:");
                widok.append(c.wypisz2());
                widok.append("\n\t\t                             Macierz 2:");
                widok.append(d.wypisz2());
            }
            
            else if(e.getSource() == widok.OpM)
            {
                widok.append("\n********************************************************************************************************************\n");
                widok.append("\t              ----------------- OPERACJE NA MACIERZACH ---------------\n");
                widok.append("********************************************************************************************************************\n");
                MacierzOdwr c, d;
                c = new MacierzOdwr(new double [][] {
                                                    {2,1},
                                                    {5, 3}
                                                    }
                                   );

                d = new MacierzOdwr(new double [][] {
                                                    {2,3},
                                                    {1, 4}
                                                    }
                                   );
                
                widok.append("\n\t\t            * MACIERZE ODWROTNE * \n");
                if((c=c.odwroc()) !=null)
                {
                    widok.append("\t\t                             Macierz 1:");
                    widok.append(c.wypisz2());
                }
                else widok.append("Nie da sie odwrocic macierzy");

                if((d=d.odwroc()) !=null)
                {
                    widok.append("\n\t\t                             Macierz 2:");
                    widok.append(d.wypisz2());
                }
                else widok.append("Nie da sie odwrocic macierzy");


                widok.append("\n\t\t                       * DODAWANIE * \n");
                c.dodaj(d);
                widok.append(c.wypisz2());


                widok.append("\n\t\t            * MACIERZ ODWROTNA * ");
                if((c=c.odwroc()) !=null)
                {
                    widok.append(c.wypisz2());
                }
                else widok.append("Nie da sie odwrocic macierzy");
            }
            
            else if(e.getSource() == widok.Losowe)
            {
                widok.append("\n********************************************************************************************************************\n");
                widok.append("\t\t     ---------------- LOSOWE ----------------\n");
                widok.append("********************************************************************************************************************\n");
                Random r = new Random();

                Wektor v1, v2;
                Macierz m1, m2;

                v1 = new Wektor(r.nextInt(10), r.nextInt(10), r.nextInt(10));
                v2 = new Wektor(r.nextInt(10), r.nextInt(10), r.nextInt(10));
                widok.append("\n\t\t        * WYLOSOWANE WEKTORY * \n");
                widok.append(v1.wypisz1());
                widok.append(v2.wypisz1());


                m1 = new Macierz(new double[][] {
                    {r.nextInt(10),r.nextInt(10)},
                    {r.nextInt(10),r.nextInt(10)}
                });
                m2 = new Macierz(new double[][] {
                    {r.nextInt(10),r.nextInt(10)},
                    {r.nextInt(10),r.nextInt(10)}
                });
                widok.append("\n\t\t          * WYLOSOWANE MACIERZE * \n");
                widok.append(m1.wypisz2());
                widok.append(m2.wypisz2());

                widok.append("\n\t\t                      * DODAWANIE * \n");
                v1.dodaj(v2);
                m1.dodaj(m2);
                widok.append(v1.wypisz1());
                System.out.println();
                widok.append(m1.wypisz2());

                widok.append("\n\t\t                * ODEJMOWANIE * \n");
                v1.odejmij(v2);
                m1.odejmij(m2);
                widok.append(v1.wypisz1());
                System.out.println();
                widok.append(m1.wypisz2());

                widok.append("\n\t\t                       * MNOZENIE * \n");
                v1.pomnoz(v2);
                m1.pomnoz(m2);
                widok.append(v1.wypisz1());
                System.out.println();
                widok.append(m1.wypisz2());
            }
            else if(e.getSource() == widok.Test)
            {
                widok.append("\n********************************************************************************************************************\n");
                widok.append("\t                          -------------- ITERATOR WEKTORA --------------\n");
                widok.append("********************************************************************************************************************");
    
                WektorKolekcja vectorCollect = new WektorKolekcja();

                for (int i = 0; i < vectorCollect.kolekcja.length; i++) 
                {
                    vectorCollect.kolekcja[i] = new Wektor(10);
                }

                Iterator iterator = vectorCollect.getIterator();

                while (iterator.hasNext()) 
                {
                    Object object = iterator.next();
                    widok.append(" \n");
                    widok.append(((Wektor)object).wypisz1());
                }
            }
        }
    }
    
    
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //wersor.kasuj();
            widok.reset();
        }
    }
}
