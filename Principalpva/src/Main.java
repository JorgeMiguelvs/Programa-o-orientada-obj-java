import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor Base:");
        double valorBase = entrada.nextDouble();
        System.out.println("Quantidade Cavalos:");
        int qtdCavalos = entrada.nextInt();



        ipva objIpva = new ipva(valorBase,qtdCavalos);

        System.out.println(objIpva.imprimir());
    }
}