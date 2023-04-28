// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        System.out.println("Digite o nome");
        String nome = entradaString.nextLine();

        System.out.println("Digite a idade");
        int idade = entrada.nextInt();

        System.out.println("Digite o sexo");
        char sexo = entrada.next().charAt(0);


        System.out.println("Digite o logradouro");
        String logradouro = entradaString.nextLine();

        System.out.println("Digite o numero");
        int numero = entrada.nextInt();

        System.out.println("Digite o complemento");
        String complemento = entradaString.nextLine();

        System.out.println("Digite o cep");
        String cep = entradaString.nextLine();

        Endereco endPessoa = new Endereco(logradouro, complemento, numero, cep);
        Pessoa paulo = new Pessoa(nome, idade, sexo, endPessoa);
        System.out.println(paulo.imprimir());
    }
}