/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orcos;

/**
 *
 * @author Guille
 */
public class BestiaMayor implements Orco{

    @Override
    public void defends() {
        System.out.println("La bestia mayor protege con sus manos gigantes");
    }

    @Override
    public void attacks() {
        System.out.println("La bestia mayor lanza rocas gigantes a los elfos");
    }
    
}
