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
public interface AbstractReino {
    Elfo getElfo(String type);
    Orco getOrco(String type);
}
