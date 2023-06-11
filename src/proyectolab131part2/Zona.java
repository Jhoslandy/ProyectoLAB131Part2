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
public class Zona {
    private String nombre;
    private LSimpleF lf;
    private LDobleE le;
    private int idZona;
    public Zona(){
       
    }
    public Zona(String a,LSimpleF b,LDobleE c,int d){
        nombre=a;
        lf=b;
        le=c;
        idZona=d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LSimpleF getLf() {
        return lf;
    }

    public void setLf(LSimpleF lf) {
        this.lf = lf;
    }

    public LDobleE getLe() {
        return le;
    }

    public void setLe(LDobleE le) {
        this.le = le;
    }

    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }
    /*public void leer(LSimpleF x,LDobleE y){
        Scanner lee=new Scanner(System.in);
        System.out.println("Nombre: ");
        nombre=lee.nextLine();
        System.out.println("id Zona: ");
        idZona=lee.nextInt();
        lf=y;
        le=x;
    }*/
    
    public void mostrar(){
        System.out.println("    ["+nombre+" "+idZona+"]");
        lf.mostrar();
        le.mostrar();
    }
}
