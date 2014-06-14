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
    double dlugosc;
    public Wektor(double x1, double x2, double x3) 
    {
        x[0] = x1;
        x[1] = x2;
        x[2] = x3;
    }
    
    public Wektor(int zakres) 
    {
        inicjalizujLosowo(zakres);
    }
    
    private void inicjalizujLosowo(int zakres) 
    {
        for (int i = 0; i < 3; i++) 
        {
            x[i] = (int)((Math.random() * zakres) + 0.5);
        }
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
    
    public double obliczDlougosc()
    {
        dlugosc = Math.sqrt(Math.pow(x[0],2)+
                            Math.pow(x[1],2)+
                            Math.pow(x[2],2)); 
        return dlugosc;
    }
    

    @Override
    public void wypisz() 
    {
            System.out.println("\t\t\t\t     [ " + x[0] +", "+x[1]+", "+x[2]+" ]");   
            if(dlugosc!=0)
            {
                System.out.println("\t\t\t\t Dlugosc = "+dlugosc);
            }
    }

    
     public String wypisz1() 
     {
        StringBuilder tmp = new StringBuilder("");
            tmp.append( String.format("\n\t\t                     [ " + x[0] +", "+x[1]+", "+x[2]+" ]\n")); 
            
            if(dlugosc!=0)
            {
                tmp.append("\t\t       Dlugosc = "+dlugosc);
            }
            return tmp.toString();
  
    }
}
