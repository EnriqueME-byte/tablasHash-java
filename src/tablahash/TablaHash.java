/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablahash;


/**
 *
 * @author Enrique
 */
public class TablaHash {
    
    private ModeloHash[] miTablaHash;
    private int tam; //Tamaño de la tabla (recomendado un número primo)
    
    public TablaHash(int tam){
        this.tam = tam;
        miTablaHash = new ModeloHash[tam];
        for (int i = 0; i < tam; i++)
            miTablaHash[i] = new ModeloHash();
    }
    
    //función hash por division 
    private int divisionPorModulo(int clave){
        return (clave % this.tam);
    }
    
    public void inserta(int clave){
        int posicion = divisionPorModulo(clave);//Obtiene la posición donde se va a insertar la clave
        System.out.println("La clave: " + clave + "\tse va insertar en la posición: " + posicion);
        this.miTablaHash[posicion].getElementos().insertarAlInicio(clave);//.setElementos(l);//se inserta la lista en la tabla
    }
    
    public boolean busca(int clave){
        int posicion = divisionPorModulo(clave);
        if(this.miTablaHash[posicion].getElementos() != null)
            return this.miTablaHash[posicion].getElementos().buscar(clave);
        return false;
    }
    
    public boolean elimina(int clave){
        int posicion = divisionPorModulo(clave);
        if(this.miTablaHash[posicion].getElementos() != null){
            return (this.miTablaHash[posicion].getElementos().eliminar(clave));
        }
        return false;
    }

    public ModeloHash[] getMiTablaHash() {
        return miTablaHash;
    }

    public void setMiTablaHash(ModeloHash[] miTablaHash) {
        this.miTablaHash = miTablaHash;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    
}
