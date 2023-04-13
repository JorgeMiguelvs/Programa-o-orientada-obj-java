public class Main {
    public static void main(String[] args) {
        Pessoa maria = new Pessoa();

        Pessoa joao;
        joao = new Pessoa();

        //inserir dados
        maria.nome = "Maria";
        maria.idade = 19;
        maria.sexo = 'f';

        joao.nome = "Joao";
        joao.idade=55;
        joao.sexo = 'm';

        //resgata os dados

        System.out.println(maria.imprimir());
        System.out.println(joao.imprimir());

    }
}