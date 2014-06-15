/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dedio.czwarty;

/**
 *
 * @author Indzia
 */
public class Wersor extends Wektor implements Wypisywalny
{
   
    String getValue;
    
    public Wersor(){};
    
    public Wersor(double x1, double x2, double x3) { super(x1, x2, x3); }

    public String about_wersor() 
    {
        if(x[1] == 0 & x[2] == 0)
        {
            return String.format("\t\t    To jest wersor osi X o dlugosci - " + x[0]+"\n");
        }
        else if(x[0] == 0 & x[2] == 0)
        {
            return String.format("\t\t    To jest wersor osi Y o dlugosci - " + x[1]+"\n");
        }
        else if(x[0] == 0 & x[1] == 0)
        {
            return String.format("\t\t    To jest wersor osi Z o dlugosci - " + x[2]+"\n");
        }
    
        return null;
    }

    String getValue() 
    {
        return about_wersor().toString();
    }
}
