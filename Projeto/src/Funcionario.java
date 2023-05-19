public class Funcionario {
    private double salario;
    private String nome;
    public Funcionario (){}
    public double aumentarSalario(double porcentual){
        return this.salario += salario * porcentual/100;
    }
    public Funcionario (String nome, double salario)
    {
        this.setNome(nome);
        this.setSalario(salario);
    }
    public String imprimir() {
        return  "\nNome: " + getNome() +
                "\n Salario: " + String.format("%.2f", salario);
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
