/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos;
import Elfos.Elfo;
import Orcos.Orco;
/**
 *
 * @author Guille
 */
public class Reinos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractReino factory;

        factory =  ReinoProducer.getReino("orco");
        Orco orco = factory.getOrco("hechicero");
        orco.defends();
        orco.attacks();
        
        Orco orco2 = factory.getOrco("lanzador");
        orco2.defends();
        orco2.attacks();
        
        factory = ReinoProducer.getReino("elfo");
        Elfo elfo = factory.getElfo("rey elfo");
        elfo.attack();
        elfo.defends();
        
        Elfo elfo2 = factory.getElfo("arquero");
        elfo2.attack();
        elfo2.defends();
        
        
        
        
    }
    
}
