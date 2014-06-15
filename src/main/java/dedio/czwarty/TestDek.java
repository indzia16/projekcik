/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dedio.czwarty;

/**
 *
 * @author Indzia
 */
public class TestDek extends Dekorator
{

    Wersor wersor;
    
    public TestDek(Wersor wersor)
    {
        this.wersor = wersor;
    }
    
    
    @Override
    public String about_wersor() 
    {
        return wersor.about_wersor() + "   TEST DEKORATORA";
    }

}

