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
public class ModeloHash {
    
    private Lista elementos;
    
    public ModeloHash() {
        elementos = new Lista();
    }
    
    public Lista getElementos() {
        return elementos;
    }

    public void setElementos(Lista elementos) {
        this.elementos = elementos;
    }
    
    
}
