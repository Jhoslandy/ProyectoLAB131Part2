/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolab131part2;

import java.util.Scanner;

/**
 *
 * @author XTREME GAMER
 */
public class Sucursal {
    private String nomSucursal,direccion;
    Sucursal(String a,String b){
        nomSucursal=a;
        direccion=b;
    }

    public String getNomSucursal() {
        return nomSucursal;
    }

    public void setNomSucursal(String nomSucursal) {
        this.nomSucursal = nomSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void leer(){
        Scanner lee=new Scanner(System.in);
        System.out.println("Nombre Sucursal: ");
        nomSucursal=lee.next();
        System.out.println("Direccion: ");
        direccion=lee.next();
    }
    
    public void mostrar(){
        System.out.println("            <"+nomSucursal+" "+direccion+">");
    }
}
