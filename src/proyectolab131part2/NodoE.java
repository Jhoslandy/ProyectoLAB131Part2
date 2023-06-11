/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolab131part2;

/**
 *
 * @author MiPC
 */
public class NodoE {
    private EstablecimientoDeSalud e;
    private NodoE ant,sig;
    public NodoE(){
        ant=sig=null;
    }

    public EstablecimientoDeSalud getE() {
        return e;
    }

    public void setE(EstablecimientoDeSalud e) {
        this.e = e;
    }
    public NodoE getAnt() {
        return ant;
    }
    public void setAnt(NodoE ant) {
        this.ant = ant;
    }
    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }
}
