/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orcos;
import reinos.AbstractReino;
import Elfos.Elfo;
/**
 *
 * @author Guille
 */
public class FactoryOrcos implements AbstractReino {
    @Override
    public Orco getOrco(String type){
        switch(type){
            case "hechicero":
                return new Hechicero();
            case "lanzador":
                return new Lanzador();
            case "bestia mayor":
                return new BestiaMayor();
                
        }
        return null;
    }
    @Override
    public Elfo getElfo(String type) {
        return null;
    }
    
}
