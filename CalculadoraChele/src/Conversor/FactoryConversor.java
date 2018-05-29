/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;
import AbstractFactory.AbstractFactory;
import Aritmetica.Aritmetica;
/**
 *
 * @author Guille
 */
public class FactoryConversor implements AbstractFactory{

    @Override
    public Aritmetica getAritmetica(String type) {
        return null;
    }
    
    public Conversor getConversor(String type) {
        switch (type){
            case "binario":
                return new Binario();
        }
        return null;
    }
    
}
