/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dedio.czwarty;

/**
 *
 * @author Indzia
 */
import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author Indzia
 */
public class Singleton 
{
    private static volatile Singleton singleton = null;

    
    static Singleton Singleton() 
    {
        if (singleton == null) 
        {
            synchronized (Singleton.class) 
            {
                if (singleton == null) 
                {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    
    public void powitanie()
    {
        System.out.println("############################ Dzien dobry oto moj projket z JAVY ############################ \n");
    }
    
    public void napisy()
    {
        System.out.println("\t\t\t\t\t\t\tWykonala : DEDO INGA \n");
    }

}