/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas_e;

/**
 *
 * @author anilb
 */
public class MariaGustos {
    
    int sexo, gustos;
    String nombre;

    public MariaGustos(int sexo, int gustos, String nombre) {
        this.sexo = sexo;
        this.gustos = gustos;
        this.nombre = nombre;
    }
    
    
    public void Resultado(){
        System.out.println("Maria estima a "+nombre+" porque es hombre y le gusta bailar");
    }
    
}
