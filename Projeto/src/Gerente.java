    public class Gerente extends Funcionario {

    private int numeroFuncionario;
    public Gerente(){
        super();
    }
    public Gerente (double salario, String nome, int numeroFuncionarios){
        super(nome,salario);
        this.setNumeroFuncionario(numeroFuncionarios);
    }

    @Override //subescreva a classe

     public double aumentarSalario(double percentual){
     return  super.aumentarSalario(percentual+20);
    }
    @Override

    public String imprimir(){
        return super.imprimir()+"\n Número de funcionario: "+ getNumeroFuncionario();
    }
    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }
    }


