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
public class Farmacia {
    private String nombre,direccion,tipo;
    private PilaS sucursales;
    public Farmacia(){
        
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public PilaS getSucursales() {
        return sucursales;
    }

    public void setSucursales(PilaS sucursales) {
        this.sucursales = sucursales;
    }
    
    
    public void leer(){
        Scanner lee=new Scanner(System.in);
        System.out.println("Nombre: ");
        nombre=lee.nextLine();
        System.out.println("Direccion: ");
        direccion=lee.nextLine();
    }
    public void mostrar(){
        System.out.println("        <"+nombre+" "+direccion+">");
    }
}
