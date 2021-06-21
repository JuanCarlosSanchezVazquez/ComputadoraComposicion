/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.hardware;

import ico.fes.perifericos.Monitor;
import ico.fes.perifericos.Mouse;
import ico.fes.perifericos.Teclado;

/**
 *
 * @author carlos
 */
public class PC {
    
    private int marca;
    private int modelo;
    private Monitor []monitores;
    private Mouse mouse;
    private Teclado teclado;
    private CPU cpu;

    public PC() {
    }

    public PC(int marca, int modelo, Monitor[] monitores, Mouse mouse, Teclado teclado, CPU cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitores = monitores;
        this.mouse = mouse;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Monitor[] getMonitores() {
        return monitores;
    }

    public void setMonitores(Monitor[] monitores) {
        this.monitores = monitores;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "PC{" + "marca=" + marca + ", modelo=" + modelo + ", monitores=" + monitores + ", mouse=" + mouse + ", teclado=" + teclado + ", cpu=" + cpu + '}';
    }
    
    
}

    
  