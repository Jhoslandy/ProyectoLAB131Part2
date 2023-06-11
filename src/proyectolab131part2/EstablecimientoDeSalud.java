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
public class EstablecimientoDeSalud {
    private String nombre,direccion,sector,tipo;
    private int nivel;
    public EstablecimientoDeSalud(String a,String b,String c,int d,String e){
        nombre=a;
        direccion=b;
        sector=c;
        nivel=d;
        tipo=e;
    }
    public EstablecimientoDeSalud(){
        
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void leer(){
        Scanner lee=new Scanner(System.in);
        System.out.println("Nombre: ");
        nombre=lee.nextLine();
        System.out.println("Direccion: ");
        direccion=lee.nextLine();
        System.out.println("Sector: ");
        sector=lee.nextLine();
        System.out.println("Nivel: ");
        nivel=lee.nextInt();
        System.out.println("Tipo: ");
        tipo=lee.nextLine();
    }
    public void mostrar(){
        System.out.println("        <"+nombre+" "+direccion+" "+sector+" "+nivel+" "+tipo+">");
    }
}
