/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package porvalor;

/**
 *
 * @author jorge.mvsilva1
 */
public class PorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 50;
        
        modificar(a);
        System.out.println("(main): Valor de a:" + a);
    }
    
    static void modificar(int a)
    {
        a = 200;
        System.out.println("(metodo): Valor de a:"+a);
    }
    
}
