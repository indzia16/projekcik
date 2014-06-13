/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diedo.czwarty;

/**
 *
 * @author Indzia
 */
public class Algebra 
{
    public void iloscElementow(Object o)
    {
        if(o instanceof Wektor)
        {
            System.out.println("\n\t\t\t     ^^ Ten wektor ma " + ((Wektor)o).x.length + " wspolrzedne ^^");
        }
        
        if(o instanceof Macierz)
        {
            System.out.println("\t\t\t\t\t   ^^ Ta macierz ma " + ((Macierz)o).a.length * ((Macierz)o).a[0].length + " wspolczynniki  ^^");
        }
        
    }
}
