/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dedio.czwarty;

import java.util.Arrays;

/**
 *
 * @author Indzia
 */
public class WektorKolekcja implements Container
{

    public Wektor[] kolekcja = new Wektor[10];
    
    @Override
    public Iterator getIterator() 
    {
        WektorIterator iterator = new WektorIterator();
        return iterator;
    }
    
    private class WektorIterator implements Iterator
    {

        private int pozycja;
    
        WektorPorownaj porownaj = new WektorPorownaj();
        
        public WektorIterator() 
        {
            Arrays.sort(kolekcja, porownaj);
            pozycja = 0;
        }
        
    
        @Override
        public boolean hasNext() 
        {
            if (pozycja < kolekcja.length) 
            {
                return true;
            }
            else 
            {
                return false;
            }
        }

        @Override
        public Object next() 
        {
            if (hasNext()) 
            {
                return kolekcja[pozycja++];
            }
            else 
            {
                return null;
            }
        }
    
    }
}
