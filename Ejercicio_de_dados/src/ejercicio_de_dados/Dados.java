/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_de_dados;

import java.util.Random;

/**
 *
 * @author JONATAN
 */
public class Dados {
    int valor = 0;
     
    public int lanzar(){
        Random generador = new Random();
        valor = generador.nextInt(6)+1;
        return valor ;
        
    }
    
}
