public class Animal {
    private String nome;
    private String cor;
    private int nascimento;
    private String raca;
    private Proprietario proprietario;


    public Animal(String nome, String cor, int nascimento, Proprietario proprietario, String raca) {
        this.nome = nome;
        this.cor = cor;
        this.nascimento = nascimento;
        this.proprietario = proprietario;
        this.raca=raca;
    }

    public String getRaca()
    {
        return raca;
    }

    public void setRaça(String raca)
    {
        this.raca = raca;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String imprimir(){
        return "Nome: " + nome +
                "\nCor: " + cor +
                "\nNascimento: " + nascimento +
                "Proprietario: " + proprietario +
                "Raça: "+ raca;
    }

}
