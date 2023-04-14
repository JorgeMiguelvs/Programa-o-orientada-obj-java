/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author jorge.mvsilva1
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Times horaEvento = new Times(9,30,12);
        System.out.println("hora Evento: "+horaEvento.imprimir());
        System.out.println(horaEvento.getHora());
        horaEvento.setHora(11);
        
     
        System.out.println(horaEvento.getMinuto());
        horaEvento.setMinuto(35);
      
        
        System.out.println(horaEvento.getSegundo());
        horaEvento.setSegundo(54);
        
        System.out.println("hora Evento: " + horaEvento.imprimir());
    }
    
}
