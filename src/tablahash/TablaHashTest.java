/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablahash;

import lista.Lista;

/**
 *
 * @author Enrique
 */
public class TablaHashTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TablaHash tabla = new TablaHash(47);
        tabla.inserta(3840);
        tabla.inserta(2040);
        tabla.inserta(1408);
        tabla.inserta(2100);
        tabla.inserta(5200);
        tabla.inserta(200);
        tabla.inserta(5400);
        tabla.inserta(720);
        tabla.inserta(500);
        int clave =5200;
        
        
        if(tabla.busca(clave))
            System.out.println("clave " + clave + " encontrada");
        else
            System.out.println("clave " + clave + " no encontrada");
        
        
        if(tabla.elimina(clave))
            System.out.println("clave: " + clave + " eliminada");
        else
            System.out.println("clave: " + clave + " no encontrada");
        
        if(tabla.busca(clave))
            System.out.println("clave " + clave + " encontrada");
        else
            System.out.println("clave " + clave + " no encontrada");
        
        if(tabla.elimina(clave))
            System.out.println("clave: " + clave + " eliminada");
        else
            System.out.println("clave: " + clave + " no encontrada");
        
        clave = 500;
        if(tabla.busca(clave))
            System.out.println("clave " + clave + " encontrada");
        else
            System.out.println("clave " + clave + " no encontrada");
        
        tabla.elimina(clave);
        if(tabla.busca(clave))
            System.out.println("clave " + clave + " encontrada");
        else
            System.out.println("clave " + clave + " no encontrada");
        
        tabla.inserta(5010);
        tabla.inserta(1200);
        
    }
    
}
