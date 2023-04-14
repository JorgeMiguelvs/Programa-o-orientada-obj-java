/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author jorge.mvsilva1
 */
public class Times {
 
    private int hora;
    private int minuto;
    private int segundo;
    
    public Times(int hora, int minuto, int segundo){
        if(hora>=0 && hora<24)
            this.hora = hora;
        if(minuto>=0 && minuto<60)
            this.minuto= minuto;
        if(segundo>=0 && segundo<60)
            this.segundo =segundo;
            
}
    
    public int getHora(){
        return this.hora;
    }
    public int getMinuto(){
        return this.minuto;
    }
    
    public int getSegundo(){
        return this.segundo;
    }
    
    // set n precisa retornar
    public void setHora(int hora){
        if(hora>=0 && hora<24)
        this.hora= hora;
        
    }
    
    public void setMinuto(int minuto)
    {
        if(minuto>0 && minuto<60)
            this.minuto= minuto;
    }
    
    public void setSegundo(int segundo)
    {
        if(segundo>0 && segundo<60)
            this.segundo= segundo;
    }
   
    public String imprimir()
    {
        return hora+":"+minuto+":"+segundo;
    }
    
    
}