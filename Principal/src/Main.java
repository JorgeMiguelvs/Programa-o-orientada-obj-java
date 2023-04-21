import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       Hero listarHero[] = new Hero[5];
       Hero hero;
       int i;
       String nome,poder;


       for(i=0; i<listarHero.length;i++)
       {
           System.out.println("==>Dados do hero"+ (i+i)+";");
           System.out.println("Heroi:");
           nome = entrada.nextLine();

           System.out.println("Poder:");
           poder = entrada.nextLine();
           //chama o contrutor com parâmetros

           hero = new Hero(nome,poder);
           listarHero[i] = hero;
       }

       System.out.println("===Herois Cadastrados===");
       for(Hero h:listarHero){
           System.out.println(h.imprimir()+"\n");
       }

       
    }
}

