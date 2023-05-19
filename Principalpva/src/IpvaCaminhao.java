public class IpvaCaminhao extends ipva{
private int quantidadeEixos;
    public IpvaCaminhao(){
        super();
    }
    public IpvaCaminhao(double valorBase,int qtdCavalos){
    super(valorBase,qtdCavalos);
    this.setQuantidadeEixos(qtdCavalos);
    }
    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override

    public double calcularIpva(){
        return super.calcularIpva() * quantidadeEixos;
    }
    @Override

    public String imprimir(){
        return super.imprimir()+"\n Número de Eixos: "+ getQuantidadeEixos();
    }
}
