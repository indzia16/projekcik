/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dedio.czwarty;

import java.util.Comparator;

/**
 *
 * @author Indzia
 */
public class WektorPorownaj implements Comparator<Wektor> 
{

    @Override
    public int compare(Wektor t, Wektor t1) 
    {
        if (t1 == null) 
        {
            return -1;
        }
        if (t.obliczDlougosc() < t1.obliczDlougosc()) 
        {
            return 1;
        }
        else if (t.obliczDlougosc() > t1.obliczDlougosc()) 
        {
            return -1;
        }
        else 
        {
            return 0;
        }
    }
    
}
