/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolab131part2;

/**
 *
 * @author MiPC
 */
public class NodoF {
    private Farmacia f; 
    private NodoF sig;
    public NodoF(){
        sig=null;
    }
    public Farmacia getF() {
        return f;
    }
    public void setF(Farmacia f) {
        this.f = f;
    }
    
    public NodoF getSig() {
        return sig;
    }
    public void setSig(NodoF sig) {
        this.sig = sig;
    }
}
