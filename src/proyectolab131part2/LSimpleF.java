/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolab131part2;

import java.util.Scanner;

/**
 *
 * @author MiPC
 */
public class LSimpleF {
    private NodoF p;
    LSimpleF(){
        p=null;
    }
    public NodoF getP() {
        return p;
    }
    public void setP(NodoF p) {
        this.p = p;
    }
    public void adiPrincipio(){
        Farmacia f=null;
        f.leer();
        NodoF nue=new NodoF();
        nue.setF(f);
        nue.setSig(getP());
        setP(nue);
    }
    public void adiPrincipio(Farmacia x){
        //Farmacia f=new Farmacia();
        //f.leer();
        NodoF nue=new NodoF();
        nue.setF(x);
        nue.setSig(getP());
        setP(nue);
    }
    public void leer(int n){
        for(int i=1;i<=n;i++){
            System.out.println("Farmacia "+i);
            adiPrincipio();
        }
    }
    public void mostrar(){
        NodoF r=getP();
        while(r!=null){
            r.getF().mostrar();
            r=r.getSig();
        }    
    }
}
