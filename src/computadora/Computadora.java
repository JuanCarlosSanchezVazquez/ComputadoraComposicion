/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.hardware.CPU;
import ico.fes.hardware.PC;
import ico.fes.perifericos.Monitor;
import ico.fes.perifericos.Mouse;
import ico.fes.perifericos.Teclado;


public class Computadora {
    
    
    
    public static void main(String[] args) {
        
        PC computadora1 = new PC();
        // hardware
        
        computadora1.setMarca(1); // el ejercicio pedia int pero para marcas debio haber sido str
        computadora1.setModelo(2021); // la misma situacion que con la marca
        computadora1.setCpu(new CPU("Gigabyte", "C200", 4));
        
        // Perifericos
        
        computadora1.setTeclado(new Teclado("Logitech", "G915", 110, 3));
        
        computadora1.setMouse(new Mouse("Logitech", "G305", "Alambrico"));
        
        Monitor[] tmpMonitores = new Monitor[3];
        tmpMonitores[0] = new Monitor("ACER", "XFA240", 24);
        tmpMonitores[1] = new Monitor("ASUS", "VG248QGC", 24 );
        tmpMonitores[2] = new Monitor("SAMSUNG", "THUNDERBOLT-3",34);
        computadora1.setMonitores(tmpMonitores);
        
        System.out.println(computadora1);
        System.out.println(computadora1.getMonitores()[0]);
        System.out.println(computadora1.getMonitores()[1]);
        System.out.println(computadora1.getMonitores()[2]);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  


}
