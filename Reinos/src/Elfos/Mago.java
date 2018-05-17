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
public class Mago implements Elfo{

    @Override
    public void attack() {
        System.out.println("El mago utiliza un hechizo de crucificción, elimina"
                + "a 100 orcos en un rango radial de 1km");
    }
    @Override
    public void defends() {
        System.out.println("El mago utiliza un hechizo proteccion divina sobre"
                + "los demas elfos.");
    }
    
}
