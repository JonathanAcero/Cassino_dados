/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_de_dados;

/**
 *
 * @author JONATAN
 */
public class Calcular extends Graficos {
    String mensaje_final;
   
    
    void calcular_juego(){
    
        if (resultado==3){
            saldo = saldo-(apuesta*2);
            mensaje_final = "ha perdido el doble de lo  apostado";
               }
        else{ 
             if (resultado==7){
            saldo = saldo+apuesta;
            mensaje_final = "ha ganado lo apostado";
             }
            else{ 
                if (resultado==9){
                saldo = saldo-((apuesta*20)/100);
                mensaje_final = "ha perdido el 20% de la apuesta";
               }
                else{
                      if (resultado==12){
                      saldo = saldo+(apuesta*2);
                      mensaje_final = "ha ganado el doble de lo apostado";
                      }
                      else{ 
                      saldo = saldo - apuesta;
                      mensaje_final = "ha perdido lo apostado";
                          }
                      
                    } 
         }
        
        }    
    }    
}
    
    
    

