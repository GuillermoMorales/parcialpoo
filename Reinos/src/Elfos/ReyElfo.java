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
public class ReyElfo implements Elfo{

    @Override
    public void attack() {
        System.out.println("El Rey Elfo ataca con una supernova, elimina a la "
                + "mitad de los orcos");
    }
    @Override
    public void defends() {
        System.out.println("El Rey Elfo ha utilizado resurreción,revive a todos"
                + "sus elfos muertos por 5 min");
    }
    
}
