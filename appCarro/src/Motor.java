public class Motor {
    private double torque;
    private int cilindro;
    private double litragem;
    private boolean ligado;

    public Motor(double torque,int cilindro,double litragem) {
        this.torque = torque;
        this.litragem = litragem;
        this.cilindro = cilindro;
        ligado = false;
    }

    public Double getTorque() {

        return torque;
    }

    public int getCilindro() {

        return cilindro;
    }

    public Double getLitragem() {

        return litragem;
    }

    public String imprimir() {
        String funcionando  = (ligado?"Motor ligado": "Motor desligado");
        return "Motor{"+
                ", cilindro = "+ cilindro +
                ", torque = "+torque +
                ", litragem = " + litragem +
                ", "+funcionando+
                '}';
    }
    public Boolean LigaDesliga()
    {
        ligado =!ligado;
        return ligado;
    }
}


