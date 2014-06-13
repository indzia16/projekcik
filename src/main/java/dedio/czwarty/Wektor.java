/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dedio.czwarty;

/**
 *
 * @author Indzia
 */
public class Wektor extends Algebra implements Dzialaj, Wypisywalny
{
    protected double[] x = new double[3];
    public Wektor() {};
    public Wektor(double x1, double x2, double x3) 
    {
        x[0] = x1;
        x[1] = x2;
        x[2] = x3;
    }
    
    @Override
    public void dodaj(Object o) 
    {
        Wektor w1=(Wektor)o;
        
        for(int i=0; i< x.length; i++)
        {
            x[i]+=w1.x[i];
        }
    }

    @Override
    public void odejmij(Object o) 
    {
        Wektor w1=(Wektor)o;
        
        for(int i=0; i< x.length; i++)
        {
            x[i]-=w1.x[i];
        }        
    }

    @Override
    public void pomnoz(Object o) 
    {
        Wektor w1=(Wektor)o;
        
        for(int i=0; i< x.length; i++)
        {
            x[i]*=w1.x[i];
        }        
    }

    @Override
    public void wypisz() 
    {
            System.out.println("\t\t\t\t     [ " + x[0] +", "+x[1]+", "+x[2]+" ]");   
    }
}
