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
public class Hechicero implements Orco{

    @Override
    public void defends() {
        System.out.println("El hechicero orco crea un manto protector"
                + "para cada orco en el campo de batalla");
    }

    @Override
    public void attacks() {
        System.out.println("El hechicero orco invoca demonios para ayudar "
                + "a su ejército, durante 5 min");
    }
    
}
