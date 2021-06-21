/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.perifericos;

/**
 *
 * @author carlos
 */
public class Monitor {
    
    private String marca;
    private String modelo;
    private int pulgadas;

    public Monitor() {
    }

    public Monitor(String marca, String modelo, int pulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPulgadas(int pulgadas) {
        //return pulgadas;
        
        if( pulgadas >= 19 && pulgadas <= 30){
            this.pulgadas = pulgadas;
            System.out.println("Pulgadas");
            //System.out.println("");
        } 
        return pulgadas ;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", modelo=" + modelo + ", pulgadas=" + pulgadas + '}';
    }
    
    public boolean encender(){
        System.out.println(" Encendiendo " + this.marca);
        return true;
    }

    public boolean apagar(){
        System.out.println(" Apagando ");
        return false;
    }
}
