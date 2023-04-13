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

        //----------

        Lampada led= new Lampada();

        led.tipo = "de ligar";
        led.cor="amarelow";
        led.marca="Samsung";
        led.potencia=110;

        System.out.println(led.lampada());

        //------------

        Livro lr = new Livro();

        lr.nome="O Jorge";
        lr.autor="Jorge";
        lr.classificao="Educativo";
        lr.editora="Aurora";
        lr.genero="Drama";
        lr.estaEmprestado=false;
        lr.paginas=101;

        System.out.println(lr.retorno());


        Nota n = new Nota();
        n.n1=3;
        n.n2=10;
        n.n3=5;

        n.notaFinal = (n.n1+n.n2+n.n3)/3;

        System.out.println(n.verificarMedia());



    }





}