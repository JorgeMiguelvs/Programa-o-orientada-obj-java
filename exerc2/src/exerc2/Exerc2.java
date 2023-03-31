/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerc2;

import java.util.Scanner;

/**
 *
 * @author jorge.mvsilva1
 */
public class Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String []fruta = {"carambola","maça","pera","uva","laranja","goiaba"
        ,"ameixa","mamão","melancia","framboesa","pitanga","açai","graviola",
        "banana","maracuja"};
        
        pesquisar(fruta);
        
    }
    
    public static void pesquisar(String []pesq)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma fruta");
        for(int i =0;i< pesq.length;i++)
        {
             String valor = entrada.toString();
            
        }
        System.out.println(pesq.length);
    }
}
