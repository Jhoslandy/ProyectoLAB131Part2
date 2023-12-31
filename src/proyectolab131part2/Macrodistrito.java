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
public class Macrodistrito {
    private String nombre;
    private int id;
    private CSimpleZ cz;
    
    Macrodistrito(String a,int b,CSimpleZ c){
        nombre=a;
        id=b;
        cz=c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CSimpleZ getCz() {
        return cz;
    }

    public void setCz(CSimpleZ cz) {
        this.cz = cz;
    }
    
    public void leer(CSimpleZ x){
        Scanner lee=new Scanner(System.in);
        System.out.println("Nombre de MacroDis: ");
        nombre=lee.nextLine();
        System.out.println("Id de Macro. : ");
        id=lee.nextInt();
        //System.out.println("Cant de zonas: ");
        //int n=lee.nextInt();
        //cz.leer(n);
        cz=x;
    }
    
    
    public void mostrar(){
        System.out.println("["+nombre+" "+id+"]");
        cz.mostrar();
    }
}
