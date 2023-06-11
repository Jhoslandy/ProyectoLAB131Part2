/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolab131part2;

/**
 *
 * @author MiPC
 */
public class LDobleE {
    private NodoE p;
    public LDobleE(){
        p=null;
    }
    public NodoE getP() {
        return p;
    }
    public void setP(NodoE p) {
        this.p = p;
    }
    public void adiFinal(){
        EstablecimientoDeSalud e=new EstablecimientoDeSalud();
        e.leer();
        NodoE nue=new NodoE();
        nue.setE(e);
        if(getP()==null){
            setP(nue);
        }
        else{
            NodoE r=getP();
            while(r.getSig()!=null){
                r=r.getSig();
            }
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    public void adiFinal(EstablecimientoDeSalud x){
        //EstablecimientoDeSalud e=new EstablecimientoDeSalud();
        //e.leer();
        NodoE nue=new NodoE();
        nue.setE(x);
        if(getP()==null){
            setP(nue);
        }
        else{
            NodoE r=getP();
            while(r.getSig()!=null){
                r=r.getSig();
            }
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    public void leer(int n){
        for(int i=1;i<=n;i++){
            System.out.println("Establecimiento de salud "+i);
            adiFinal();
        }
    }
    public void mostrar(){
        NodoE r=getP();
        while(r!=null){
            r.getE().mostrar();
            r=r.getSig();
        }
    }
}
