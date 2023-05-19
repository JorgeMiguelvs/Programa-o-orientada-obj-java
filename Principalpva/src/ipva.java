public class ipva {
    private double valorBase;
    private int qtdCavalos;
    public ipva(){}
    public ipva(double valorBase,int qtdCavalos){
        this.setValorBase(valorBase);
        this.setQtdCavalos(qtdCavalos);
    }
    public double getValorBase() {
        return valorBase;
    }

    public double calcularIpva(){
        return valorBase * qtdCavalos;
    }
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public int getQtdCavalos() {
        return qtdCavalos;
    }

    public void setQtdCavalos(int qtdCavalos) {
        this.qtdCavalos = qtdCavalos;
    }

    public String imprimir() {
        return  "\n Valor base: " + getValorBase() +
                "\n qtdCavalos: " + getQtdCavalos()+
                "\n IPVA:" + calcularIpva();
    }
}
