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
public class Pasteleria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a small cake
        Cake cake = CakeFactory.getCake(CakeType.SMALL);
        cake.iseaten();

        // create a big cake
        cake = CakeFactory.getCake(CakeType.BIG);
        cake.iseaten();

        // create a working cake
        cake = CakeFactory.getCake(CakeType.WORKING);
        cake.iseaten();
    }
    
}
