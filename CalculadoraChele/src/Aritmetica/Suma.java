/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

/**
 *
 * @author Guille
 */
public class Suma implements Aritmetica{

    public double operar(double n1, double n2) {
        System.out.println("Suma: "+(n1+n2));
        return n1+n2;
    }
    
}