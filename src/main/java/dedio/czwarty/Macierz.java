/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dedio.czwarty;

/**
 *
 * @author Indzia
 */
public class Macierz extends Algebra implements Dzialaj, Wypisywalny
{
    protected double[][] a;
    public  Macierz() {a = new double[2][2];}
    public Macierz(double[][] am) {
        a = new double[2][2];
        int i,j;
        for(i=0; i<2; i++) {
            for(j=0; j<2; j++) {
                a[i][j] = am[i][j];
            }
        }
    }

    @Override
    public void dodaj(Object o) 
    {
        Macierz m = (Macierz)o;
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                a[i][j] += m.a[i][j];
            }
        }
    }

    @Override
    public void odejmij(Object o) 
    {
        Macierz m = (Macierz)o;
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                a[i][j] -= m.a[i][j];
            }
        }
    }

    @Override
    public void pomnoz(Object o) 
    {
        Macierz m = (Macierz)o;
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                a[i][j] *= m.a[i][j];
            }
        }
    }

    @Override
    public void wypisz() 
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.print("\t\t\t\t\t| ");
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("| \n ");
        }
        System.out.println();
    }
    
}
