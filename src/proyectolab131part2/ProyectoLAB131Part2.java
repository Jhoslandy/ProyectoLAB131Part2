/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectolab131part2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author XTREME GAMER
 */
public class ProyectoLAB131Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LDobleE le1 = new LDobleE();
        EstablecimientoDeSalud e1 = new EstablecimientoDeSalud("Pro Mujer", "C. Canonigo Ayllon", "ONGs", 2, "Clinica");
        EstablecimientoDeSalud e2 = new EstablecimientoDeSalud("El Carmen", "C. Canonigo A. Pza. el Carmen", "ONGs", 3, "Hospital");
        EstablecimientoDeSalud e3 = new EstablecimientoDeSalud("Bajo San Pedro", "C. General Gonzales #1328", "publico", 1, "Hospital");
        le1.adiFinal(e1);
        le1.adiFinal(e2);
        le1.adiFinal(e3);

        LDobleE le2 = new LDobleE();
        EstablecimientoDeSalud e4 = new EstablecimientoDeSalud("Medi Health", "Av. Sánchez Lima 2326", "ONGs", 1, "Hospital");
        EstablecimientoDeSalud e5 = new EstablecimientoDeSalud("Caja petrolera", "Av. 6 de Agosto", "ONGs", 2, "Clinica");
        EstablecimientoDeSalud e6 = new EstablecimientoDeSalud("SS Universitario", "Av. 6 de Agosto", "privado", 1, "Hospital");
        le2.adiFinal(e4);
        le2.adiFinal(e5);
        le2.adiFinal(e6);

        LDobleE le3 = new LDobleE();
        EstablecimientoDeSalud e7 = new EstablecimientoDeSalud("Arcoiris", "C. 15 de abril", "publico", 2, "Hospital");
        EstablecimientoDeSalud e8 = new EstablecimientoDeSalud("La merced", "C. Villa Aspiazu", "publico", 1, "Hospital");
        EstablecimientoDeSalud e9 = new EstablecimientoDeSalud("Caja petrolera", "C. Miguel Aparicio", "publico", 1, "Clinica");
        le3.adiFinal(e7);
        le3.adiFinal(e8);
        le3.adiFinal(e9);

        LSimpleF lf1 = new LSimpleF();
        PilaS ps1 = new PilaS();
        Sucursal s1 = new Sucursal("central", "avenida1");
        ps1.adicionar(s1);
        Farmacia f1 = new Farmacia("La glorieta", "publico", ps1);

        PilaS ps2 = new PilaS();
        Sucursal s2 = new Sucursal("Plaza San Pedro", "calle 2");
        Sucursal s3 = new Sucursal("Teleferico", "calle 3");
        ps2.adicionar(s2);
        ps2.adicionar(s3);
        Farmacia f2 = new Farmacia("Mi Farma", "institucional", ps2);

        PilaS ps3 = new PilaS();
        Sucursal s4 = new Sucursal("San Pedro", "calle 4");
        Sucursal s5 = new Sucursal("Rotonda", "calle 7");
        ps3.adicionar(s4);
        ps3.adicionar(s5);
        Farmacia f3 = new Farmacia("Angel Samuel", "publico", ps3);

        lf1.adiPrincipio(f1);
        lf1.adiPrincipio(f2);
        lf1.adiPrincipio(f3);

        LSimpleF lf2 = new LSimpleF();
        PilaS ps4 = new PilaS();
        Sucursal s6 = new Sucursal("central", "avenida 9");
        ps4.adicionar(s6);
        Farmacia f4 = new Farmacia("Victoria", "hospitalaria", ps4);

        PilaS ps5 = new PilaS();
        Sucursal s7 = new Sucursal("Plaza España", "calle 2");
        Sucursal s8 = new Sucursal("Plaza Avaroa", "avenida 3");
        ps5.adicionar(s7);
        ps5.adicionar(s8);
        Farmacia f5 = new Farmacia("Mi Farma", "institucional", ps5);

        PilaS ps6 = new PilaS();
        Sucursal s9 = new Sucursal("Plaza España", "avenida 4");
        Sucursal s10 = new Sucursal("6 de agosto", "calle 7");
        ps6.adicionar(s9);
        ps6.adicionar(s10);
        Farmacia f6 = new Farmacia("Beni", "publico", ps6);

        lf2.adiPrincipio(f4);
        lf2.adiPrincipio(f5);
        lf2.adiPrincipio(f6);

        CSimpleZ cz1 = new CSimpleZ();
        Zona z1 = new Zona("San Pedro", lf1, le1, 3455);
        Zona z2 = new Zona("Sopocachi", lf2, le2, 2288);
        cz1.adicionar(z1);
        cz1.adicionar(z2);

        PilaM m1 = new PilaM();
        Macrodistrito ma1 = new Macrodistrito("Centro", 15534, cz1);
        m1.adicionar(ma1);
        m1.mostrar();
        System.out.println("=======================ejer1=====================");
        ejer1(m1,"San Pedro");
        
        System.out.println("=======================ejer2=====================");
        ejer2(m1,"Mi Farma");
        
        System.out.println("=======================ejer3=====================");
        ejer3(m1,"Centro");
        
        System.out.println("=======================ejer4=====================");
        ejer4(m1,"Centro");
        
        System.out.println("=======================ejer4=====================");
        ejer5(m1,3455);
    }

    //mostrar los hospitales y farmacias de la zona x
    public static void ejer1(PilaM M, String x) {
        PilaM pm = new PilaM();
        CSimpleZ cz = new CSimpleZ();
        while (!M.esvacia()) {
            Macrodistrito maux = M.eliminar();
            CSimpleZ Z = maux.getCz();
            while (!Z.esvacia()) {
                Zona zaux = Z.eliminar();
                if (zaux.getNombre().equals(x)) {
                    LDobleE E = zaux.getLe();
                    NodoE e = E.getP();
                    while (e != null) {
                        e.getE().mostrar();
                        e = e.getSig();
                    }
                    LSimpleF F = zaux.getLf();
                    NodoF f = F.getP();
                    while (f != null) {
                        f.getF().mostrar();
                        f = f.getSig();
                    }
                }
                cz.adicionar(zaux);
            }
            Z.vaciar(cz);
            pm.adicionar(maux);
        }
        M.vaciar(pm);
    }

    //contar cuantas sucursales tiene la farmacia x en la ciudad de La Paz y mostrarlos por zona
    public static void ejer2(PilaM M, String x) {
        System.out.println("2.Contar cuantas sucursales tiene la farmacia " + x + " en la ciudad de La Paz");
        PilaM pm = new PilaM();
        CSimpleZ cz = new CSimpleZ();
        PilaS ps = new PilaS();
        int c = 0;
        while (!M.esvacia()) {
            Macrodistrito m = M.eliminar();
            CSimpleZ Z = m.getCz();
            while (!Z.esvacia()) {
                Zona z = Z.eliminar();
                LSimpleF F = z.getLf();
                NodoF f = F.getP();
                while (f != null) {
                    if (f.getF().getNombre().equals(x)) {
                        System.out.println("Zona: " + z.getNombre());
                        c += f.getF().getSucursales().nroelem();
                        PilaS S = f.getF().getSucursales();
                        while (!S.esvacia()) {
                            System.out.println("Sucursales: ");
                            Sucursal s = S.eliminar();
                            s.mostrar();
                            ps.adicionar(s);
                        }
                        S.vaciar(ps);
                    }
                    f = f.getSig();

                }
                cz.adicionar(z);
            }
            pm.adicionar(m);
            Z.vaciar(cz);
        }
        M.vaciar(pm);
        System.out.println("La farmacia " + x + " tiene " + c + " sucursales en La Paz");
    }

    //mostrar los centros de salud del macrodistrito x ordenado por niveles
    public static void ejer3(PilaM M, String x) {
        PilaM pm = new PilaM();
        CSimpleZ cz = new CSimpleZ();
        ArrayList<String> aux1=new ArrayList<String>();
        ArrayList<String> aux2=new ArrayList<String>();
        ArrayList<String> aux3=new ArrayList<String>();
        while (!M.esvacia()) {
            Macrodistrito m = M.eliminar();
            if (m.getNombre().equals(x)) {
                CSimpleZ Z = m.getCz();
                while (!Z.esvacia()) {
                    Zona z = Z.eliminar();
                    LDobleE E = z.getLe();
                    NodoE e = E.getP();
                    while (e != null) {
                        if (e.getE().getNivel() == (1)) {
                            //array nivel1
                            aux1.add(e.getE().getNombre());
                        }
                        if (e.getE().getNivel() == (2)) {
                            //array nivel 2
                            aux2.add(e.getE().getNombre());
                        }
                        if (e.getE().getNivel() == (3)) {
                            //array nivel 3
                            aux3.add(e.getE().getNombre());
                        }
                        e = e.getSig();

                    }
                    cz.adicionar(z);
                }
                pm.adicionar(m);
                Z.vaciar(cz);
            }

        }
        M.vaciar(pm);
        //mostrar todos los arrays
        mostrar(aux1);
        mostrar(aux2);
        mostrar(aux3);
    }
    
    public static void mostrar(ArrayList<String> b){
        Iterator<String> r=b.listIterator();
        while(r.hasNext()){
            String cadx=r.next();
            System.out.println(cadx);
        }
    }

    //verficar si existe alguna farmacia de tipo privado en el macrodistrito x
    public static void ejer4(PilaM M, String x) {
        PilaM pm = new PilaM();
        CSimpleZ cz = new CSimpleZ();
        int c = 0;
        while (!M.esvacia()) {
            Macrodistrito m = M.eliminar();
            if (m.getNombre().equals(x)) {
                CSimpleZ Z = m.getCz();
                while (!Z.esvacia()) {
                    Zona z = Z.eliminar();
                    LSimpleF F = z.getLf();
                    NodoF f = F.getP();
                    while (f != null) {
                        if (f.getF().getTipo().equals("Privado")) {
                            c++;
                        }
                        f = f.getSig();

                    }
                    cz.adicionar(z);
                }
                pm.adicionar(m);
                Z.vaciar(cz);
            }

        }
        M.vaciar(pm);
        if (c != 0) {
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }
    }

    //Muestrame que tipo de farmacias estan disponibles en la zona con idZona y
    public static void ejer5(PilaM M, int y) {
        PilaM pm = new PilaM();
        CSimpleZ cz = new CSimpleZ();
        int n = 0;
        String[] tipos = new String[10];
        while (!M.esvacia()) {
            Macrodistrito m = M.eliminar();
            CSimpleZ Z = m.getCz();
            
            while (!Z.esvacia()) {
                Zona z = Z.eliminar();
                if (z.getIdZona() == y) {
                    LSimpleF F = z.getLf();
                    NodoF f = F.getP();
                    while (f != null) {
                        String tipo = f.getF().getTipo();
                        //recorrer la lista, si no encuentra ese tipo, adicionar
                        int c = 0;
                        for (int i = 0; i <= n; i++) {
                            if(tipo.equals(tipos[i])){
                                c++;
                            }
                        }
                        if (c == 0) {
                            n++;
                            tipos[n-1] = tipo;
                            //System.out.println(n);
                        }
                        f = f.getSig();
                    }
                }
                cz.adicionar(z);
            }
            pm.adicionar(m);
            Z.vaciar(cz);
        }
        M.vaciar(pm);
        for (int i = 0; i < n; i++) {
            System.out.println(tipos[i]);
        }
    }

    //
    public static void ejer6() {

    }
}
