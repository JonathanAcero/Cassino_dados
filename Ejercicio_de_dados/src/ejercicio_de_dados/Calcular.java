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
public class Calcular  {
   String mensaje_final;
   int apuesta,resultado;
   int saldo =10000000;
   public int calcular(){
  if (resultado==3){
            saldo = saldo-(apuesta*2);
          return saldo;
  } 
  else{ 
        if (resultado==7){
            saldo = saldo+apuesta;
            return saldo;
             }
        else{ 
            if (resultado==9){
                saldo = saldo-((apuesta*20)/100);
               return saldo;
               }
            else{
                 if (resultado==12){
                      saldo = saldo+(apuesta*2);
                     return saldo;
                      }
                 else{ 
                      if(resultado==1||resultado==2 ||resultado==4||resultado==5
                     ||  resultado==6||resultado==8 ||resultado==10|resultado==11)
                              saldo = saldo - apuesta;
                   return saldo;
                          }
                      
                    } 
         }
        
        }    
    }  

   

 public String mensaje(){
  if (resultado==3){
            
            mensaje_final = "ha perdido el doble de lo apostado";
  } else{ 
             if (resultado==7){
           
            mensaje_final = "ha ganado lo apostado";
             }
            else{ 
                if (resultado==9){
              
                mensaje_final = "ha perdido el 20% de la apuesta";
               }
                else{
                      if (resultado==12){
                     
                      mensaje_final = "ha ganado el doble de lo apostado";
                      }
                      else{   
                      if(resultado==1||resultado==2 ||resultado==4||resultado==5
                     ||  resultado==6||resultado==8 ||resultado==10|resultado==11)
                    
                      mensaje_final = "ha perdido lo apostado";
                          }
                      
                    } 
         }
        
        }    
 return mensaje_final;   }  

   



}  
    
    
    

