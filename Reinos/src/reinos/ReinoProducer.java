/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos;
import Elfos.FactoryElfos;
import Orcos.FactoryOrcos;
/**
 *
 * @author Guille
 */
public class ReinoProducer {
    public static AbstractReino getReino(String type)
    {
        switch(type){
            case "orco":
                return  new FactoryOrcos();
            case "elfo":
                return new FactoryElfos();
        }
        return null;
    }
}
