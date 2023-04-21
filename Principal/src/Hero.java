public class Hero {
    private String nome;
    private String poder;
    public Hero(){}//defalt

    public Hero(String nome, String poder){
        this.nome=nome;
        this.poder=poder;
    }
//metodo de acesso

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome=nome;
    }

    public String getPoder()
    {
        return poder;
    }
    public void setPoder(String poder){
        this.poder=poder;
    }

//metodo da classe

    public String imprimir()
    {
        return "Hero "+nome+"\nPoder: "+ poder;
    }
    }
