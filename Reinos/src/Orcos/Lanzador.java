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
public class Lanzador implements Orco{

    @Override
    public void defends() {
        System.out.println("El lanzador se protege a si mismo con una posima");
    }

    @Override
    public void attacks() {
        System.out.println("El lanzador lanza un meteorito sacado de otra "
                + "dimension");
    }
    
}
