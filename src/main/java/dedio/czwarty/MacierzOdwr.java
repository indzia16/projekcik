/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dedio.czwarty;

/**
 *
 * @author Indzia
 */
public class MacierzOdwr extends Macierz implements Wypisywalny
{


    public MacierzOdwr(double [][]m) 
    {
        super(m);
    }
    
    public MacierzOdwr odwroc()
    {
        double det = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        MacierzOdwr tmp = null;
        if(det != 0) 
        {
            tmp = new MacierzOdwr(new double[][] 
                                            {
                                            {a[1][1]/det, -a[0][1]/det},
                                            {-a[1][0]/det, a[0][0]/det}
                                            }
                                  );
        }
        return tmp;
    }
}
