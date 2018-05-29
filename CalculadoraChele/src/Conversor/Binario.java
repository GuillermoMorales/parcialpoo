/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

/**
 *
 * @author Guille
 */
public class Binario implements Conversor{

    public String convertir(int n) {
        String binario = "";
        if(n>0){
            while(n>0){
                if(n%2 == 0){
                    binario="0"+binario;
                }
                else{
                    binario = "1"+binario;
                }
                n= (int) n/2;
            }
        }
        else if(n==0){
            binario="0";
        }
        else{
            binario="No se pudo convertir";
        }
        return binario;
    }
    
}