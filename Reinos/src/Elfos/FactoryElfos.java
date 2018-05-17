/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elfos;
import reinos.AbstractReino;
import Orcos.Orco;
/**
 *
 * @author Guille
 */
public class FactoryElfos implements AbstractReino{
    @Override
    public Elfo getElfo(String type){
        switch(type){
            case "arquero":
                    return new Arquero();
                case "mago":
                    return new Mago();
                case "rey elfo":
                    return new ReyElfo();
        }
        return null;        
    }
     

    @Override
    public Orco getOrco(String type) {
        return null;
    }
    
    
}
