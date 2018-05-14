/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.cakes;

/**
 *
 * @author Guille
 */
public class CakeFactory {
    public static Cake getCake(CakeType type)
    {
        switch(type) 
        {
            case SMALL:
                return new Chocolate();
            case BIG:
                return new Icecreamcake();
            case WORKING:
                return new Vanilla();
        }
        return null;
    }
}
