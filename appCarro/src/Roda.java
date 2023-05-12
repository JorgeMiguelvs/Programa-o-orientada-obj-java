public class Roda {
    private int aro;

    private String marca;

    private double largura;

    private boolean encher;

    public Roda( int aro, String marca,double largura) {
        this.aro = aro;
        this.marca = marca;
        this.largura = largura;
        encher = false;
    }

    public double getLargura()
    {
        return largura;
    }

    public String getMarca()
    {
        return marca;
    }

    public int getAro()
    {
        return aro;
    }

    public String imprimir() {
        String cheio  = (encher?"Ta cheio": "Precisa encher");
        return "Roda{"+
                ", largura = "+ largura +
                ", marca = "+ marca +
                ", aro = " + aro +
                ", "+cheio+
                '}';
    }
}
