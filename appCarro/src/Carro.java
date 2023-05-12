import java.util.ArrayList;
public class Carro {
    private Motor objMotor;
    private String marca;
    private String modelo;
    private int velocidade;
    private boolean acelerar;
    private  boolean freiar;
    private static ArrayList<Roda> QtdRoda = new ArrayList<>(5);

    public Carro (String marca,Motor objMotor,String modelo)
    {

        this.marca = marca;
        this.objMotor = objMotor;
        this.QtdRoda = QtdRoda;
        acelerar = true;
        freiar = false;
    }

    public  static  ArrayList<Roda> getListaHero(){
        return QtdRoda;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public  String getMotor()
    {
        return objMotor;
    }

    public String imprimir() {
        String movimento  = ;
        return "Carro{"+
                ", motor = "+ motor +
                ", marca = "+ marca +
                ", modelo = " + modelo +
                ", "+movimento+
                '}';
    }



}

