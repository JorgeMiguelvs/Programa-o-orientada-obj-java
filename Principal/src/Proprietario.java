public class Proprietario {
    private String nome;
    private int telefone;

    public Proprietario(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;

    }

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public  String getTelefone()
    {
        return nome;
    }

    public void setTelefone (int telefone)
    {
        this.telefone = telefone;
    }

}
