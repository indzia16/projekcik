/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dedio.czwarty;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import dedio.czwarty.Wersor;
import dedio.czwarty.Widok;
import dedio.czwarty.Kontroler;

/**
 *
 * @author Indzia
 */
public class Czwarty 
{
    public static void main(String[] args) throws IOException
    {
        
         Wersor wersor = new Wersor();
         Widok widok = new Widok(wersor);
         Kontroler kontroler = new Kontroler(wersor, widok);
        
         widok.setVisible(true);

        Singleton singleton = Singleton.Singleton();
        
        singleton.powitanie();
        
        Wersor[] tab = new Wersor[10];
        
        System.out.println("\t\t\t  ---------------- WEKTORY ----------------\n");
        
        tab[0]  = new Wersor(1,0,0);
        System.out.println(tab[0].about_wersor()); 
        tab[0] = new TestDek(tab[0]);
        System.out.println(tab[0].about_wersor()); 
        
        tab[1]  = new Wersor(0,0,5);
        System.out.println(tab[1].about_wersor());      
        tab[2]  = new Wersor(4,0,0);
        System.out.println(tab[2].about_wersor());       
        tab[3]  = new Wersor(0,7,0);
        System.out.println(tab[3].about_wersor());     
        tab[4]  = new Wersor(0,0,2);
        System.out.println(tab[4].about_wersor());
        tab[5]  = new Wersor(8,0,0);
        System.out.println(tab[5].about_wersor());
        tab[6]  = new Wersor(3,0,0);
        System.out.println(tab[6].about_wersor());
        tab[7]  = new Wersor(0,1,0);
        System.out.println(tab[7].about_wersor());
        tab[8]  = new Wersor(0,0,9);
        System.out.println(tab[8].about_wersor());
        tab[9]  = new Wersor(6,0,0);
        System.out.println(tab[9].about_wersor());
        
        System.out.println("\n\n\t\t  ---------------- OPERACJE NA WEKTORACH ----------------\n");
        
        System.out.println("\t\t\t\t       * DODAWANIE * ");
        tab[0].wypisz();
        tab[1].wypisz();
        tab[0].dodaj(tab[1]);
        System.out.println("\t\t\t\t           Wynik ");
        tab[0].wypisz();
        
        System.out.println("\n\t\t\t\t      * ODEJMOWANIE * ");
        tab[3].wypisz();
        tab[6].wypisz();
        tab[3].odejmij(tab[6]);
        System.out.println("\t\t\t\t           Wynik ");
        tab[3].wypisz();
        
        System.out.println("\n\t\t\t\t        * MNOZENIE * ");
        tab[8].wypisz();
        tab[4].wypisz();
        tab[8].pomnoz(tab[4]);
        System.out.println("\t\t\t\t           Wynik ");
        System.out.println(tab[8].about_wersor());
        
        System.out.println("\n\t\t\t           * MNOZENIE I DODAWANIE * ");
        tab[2].wypisz();
        tab[7].wypisz();
        tab[1].wypisz();
        tab[2].pomnoz(tab[7]);
        tab[2].dodaj(tab[1]);
        System.out.println("\t\t\t\t           Wynik ");
        System.out.println(tab[2].about_wersor());
        
        tab[2].iloscElementow(tab[2]);
        try
        {
            do_pliku(tab[2]);
        }
        catch(Exception e) {}
        
        System.out.println("\n\n\n\t\t\t ---------------- MACIERZE ----------------\n");
        
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
        
        c.wypisz();
        d.wypisz();
        
        System.out.println("\n\t\t ----------------- OPERACJE NA MACIERZACH ---------------\n");
       
        
        System.out.println("\n\t\t\t            * MACIERZE ODWROTNE * ");
        if((c=c.odwroc()) !=null)
        {
            c.wypisz();
        }
        else System.out.println("Nie da sie odwrocic macierzy");
        
        if((d=d.odwroc()) !=null)
        {
            d.wypisz();
        }
        else System.out.println("Nie da sie odwrocic macierzy");
        
        
        System.out.println("\t\t\t\t       * DODAWANIE * ");
        c.dodaj(d);
        c.wypisz();
        
        
        System.out.println("\n\t\t\t            * MACIERZ ODWROTNA * ");
        if((c=c.odwroc()) !=null)
        {
            c.wypisz();
        }
        else System.out.println("Nie da sie odwrocic macierzy");
        c.iloscElementow(c);
        
        
        System.out.println("\n\n\t\t\t ---------------- LOSOWE ----------------\n");
        
        Random r = new Random();
        
        Wektor v1, v2;
        Macierz m1, m2;
        
        v1 = new Wektor(r.nextInt(10), r.nextInt(10), r.nextInt(10));
        v2 = new Wektor(r.nextInt(10), r.nextInt(10), r.nextInt(10));
        System.out.println("\n\t\t\t\t   * WYLOSOWANE WEKTORY * ");
        v1.wypisz();
        v2.wypisz();
        
        
        m1 = new Macierz(new double[][] {
            {r.nextInt(10),r.nextInt(10)},
            {r.nextInt(10),r.nextInt(10)}
        });
        m2 = new Macierz(new double[][] {
            {r.nextInt(10),r.nextInt(10)},
            {r.nextInt(10),r.nextInt(10)}
        });
        System.out.println("\n\t\t\t\t   * WYLOSOWANE MACIERZE * ");
        m1.wypisz();
        m2.wypisz();
        
        System.out.println("\t\t\t\t       * DODAWANIE * ");
        v1.dodaj(v2);
        m1.dodaj(m2);
        v1.wypisz();
        System.out.println();
        m1.wypisz();
        
        System.out.println("\n\t\t\t\t      * ODEJMOWANIE * ");
        v1.odejmij(v2);
        m1.odejmij(m2);
        v1.wypisz();
        System.out.println();
        m1.wypisz();
        
        System.out.println("\n\t\t\t\t        * MNOZENIE * ");
        v1.pomnoz(v2);
        m1.pomnoz(m2);
        v1.wypisz();
        System.out.println();
        m1.wypisz();

        
        System.out.println("\n\n\t\t      -------------- ITERATOR WEKTORA --------------");
    
        WektorKolekcja vectorCollect = new WektorKolekcja();
        
        for (int i = 0; i < vectorCollect.kolekcja.length; i++) 
        {
            vectorCollect.kolekcja[i] = new Wektor(10);
        }
        
        Iterator iterator = vectorCollect.getIterator();
        
        while (iterator.hasNext()) 
        {
            Object object = iterator.next();
            System.out.println(" ");
            ((Wektor)object).wypisz();
        }
        
        singleton.napisy();     
    
}   
    
    public static void do_pliku(Object o) throws FileNotFoundException
    {
        if(o instanceof Wypisywalny)
        {
            PrintWriter zapis = new PrintWriter("pliczek.txt");
            zapis.println("trololo");
            zapis.close();
        }
    }
}
