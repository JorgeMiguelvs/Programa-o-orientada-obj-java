import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite o nome:");
       String nome = entrada.nextLine();
       System.out.println("Digite o sálario:");
       double salario = entrada.nextDouble();
       System.out.println("Quantidade de funcionários:");
       int numeroFuncionaios = entrada.nextInt();

       Gerente jorge = new Gerente(salario,nome,numeroFuncionaios);
       jorge.aumentarSalario(10);
       System.out.println(jorge.imprimir());
    }
}