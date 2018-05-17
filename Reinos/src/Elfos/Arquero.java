/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elfos;

/**
 *
 * @author Guille
 */
public class Arquero implements Elfo{

    @Override
    public void attack() {
        System.out.println("Arqueros tiran 150 flechas");
    }
    @Override
    public void defends() {
        System.out.println("Los arqueros sacan escudos y se defienden de ataques"
                + "con piedras de los orcos.");
    }
    
}
