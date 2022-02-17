/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas_e;
import javax.swing.Spring;
/**
 *
 * @author anilb
 */
public class TareaS_E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Hombre = 1, Mujer = 2, Comer = 3, Bailar = 4
        
        MariaGustos per1= new MariaGustos(1, 4, "Pedro");
        MariaGustos per2= new MariaGustos(1, 4, "Luis");
        MariaGustos per3= new MariaGustos(1, 3, "juan");
        MariaGustos per4= new MariaGustos(1, 3, "Mateo");
        MariaGustos per5= new MariaGustos(2, 3, "Maria");
        MariaGustos per6= new MariaGustos(2, 3, "Ana");
        
        
        // Requisitos: Sea hombre y le guste bailar
        
        //Persona 1: Pedro
        if (per1.sexo==1 && per1.gustos==4) {
            per1.Resultado();
            
        //Persona 2: Luis
        }if(per2.sexo==1 && per2.gustos==4){
        per2.Resultado();
        
         //Persona 3: Juan
     } if(per3.sexo==1 && per3.gustos==4){
         per3.Resultado();
         
         //Persona 4: Mateo
     }if(per4.sexo==1 && per4.gustos==4){
         per4.Resultado();
         
        //Persona 5: Maria
     } if(per5.sexo==1 && per5.gustos==4){
         per5.Resultado();
         
        //Persona : Ana 
     } if(per6.sexo==1 && per6.gustos==4){
         per6.Resultado();
         
     }
        
   
        
        
        
    }
}
