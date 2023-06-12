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
        
        LDobleE le4 = new LDobleE();
        EstablecimientoDeSalud e10 = new EstablecimientoDeSalud("Virgen de Copacabana", "Av. de la Oliva", "publico", 2, "Hospital");
        EstablecimientoDeSalud e11 = new EstablecimientoDeSalud("Centro Bajo San Antonio", "C. R. Castrillo", "privado", 3, "Centro de Salud");
        EstablecimientoDeSalud e12 = new EstablecimientoDeSalud("Centro Copacabana", "Av. oleoducto", "publico", 3, "Centro de Salud");
        le4.adiFinal(e10);
        le4.adiFinal(e11);
        le4.adiFinal(e12);

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
        
        
        LSimpleF lf3 = new LSimpleF();
        PilaS ps7 = new PilaS();
        Sucursal s11 = new Sucursal("villa Fatima", "av Nueva america");
        Sucursal s12 = new Sucursal("las delicias", "plza del Maestro");
        ps7.adicionar(s11); ps7.adicionar(s12);
        Farmacia f7 = new Farmacia("Bolivia", "publico", ps7);

        PilaS ps8 = new PilaS();
        Sucursal s13 = new Sucursal("Villa Fatima", "av Conzata");
        Sucursal s14 = new Sucursal("Tejada Zorsano", "plaza Villaroel");
        Sucursal s15 = new Sucursal("Central", "av Nueva america");
        ps8.adicionar(s13);
        ps8.adicionar(s14);
        ps8.adicionar(s15);
        Farmacia f8 = new Farmacia("Ave Maria", "publico", ps8);

        PilaS ps9 = new PilaS();
        Sucursal s16 = new Sucursal("central", "plaza Arandia");
        ps9.adicionar(s16);
        Farmacia f9 = new Farmacia("Nazareth", "publico", ps9);

        lf3.adiPrincipio(f7);
        lf3.adiPrincipio(f8);
        lf3.adiPrincipio(f9);
        
        LSimpleF lf4 = new LSimpleF();
        PilaS ps10 = new PilaS();
        Sucursal s17 = new Sucursal("Munaypata", "la florida");
        Sucursal s18 = new Sucursal("San antonio", "av. Republica");
        Sucursal s19 = new Sucursal("Tejar", "C. Bustillos");
        ps10.adicionar(s17); ps10.adicionar(s18); ps10.adicionar(s19);
        Farmacia f10 = new Farmacia("Bolivia", "publico", ps10);

        PilaS ps11 = new PilaS();
        Sucursal s20 = new Sucursal("El tejar", "Cancha El Tejar");
        Sucursal s21 = new Sucursal("San antonio", "av. Republica");
        ps11.adicionar(s20);
        ps11.adicionar(s21);
        Farmacia f11 = new Farmacia("Mi Farma", "publico", ps11);

        PilaS ps12 = new PilaS();
        Sucursal s22 = new Sucursal("central", "C. Lima");
        ps12.adicionar(s22);
        Farmacia f12 = new Farmacia("MediCup", "publico", ps12);

        lf4.adiPrincipio(f10);
        lf4.adiPrincipio(f11);
        lf4.adiPrincipio(f12);

        CSimpleZ cz1 = new CSimpleZ();
        Zona z1 = new Zona("San Pedro", lf1, le1, 3455);
        Zona z2 = new Zona("Sopocachi", lf2, le2, 2288);
        CSimpleZ cz2 = new CSimpleZ();
        Zona z3 = new Zona("Villa Fatima", lf3, le3, 3322);
        Zona z4 = new Zona("Villa Copacabana", lf4, le4, 5677);
        cz1.adicionar(z1);
        cz1.adicionar(z2);
        cz2.adicionar(z3);
        cz2.adicionar(z4);

        PilaM m1 = new PilaM();
        Macrodistrito ma1 = new Macrodistrito("Centro", 15534, cz1);
        Macrodistrito ma2 = new Macrodistrito("Max Paredes", 77124, cz2);
        m1.adicionar(ma1); m1.adicionar(ma2);
        m1.mostrar();
        System.out.println("=======================ejer1=====================");
        ejer1(m1,"San Pedro");
        
        System.out.println("=======================ejer2=====================");
        ejer2(m1,"Mi Farma");
        
        System.out.println("=======================ejer3=====================");
        ejer3(m1,"Centro");
        System.out.println("=======================ejer4=====================");
        ejer4(m1,3455);
        System.out.println("=======================ejer5=====================");
        ejer5(m1,"Centro");
    }

    //mostrar los hospitales y farmacias de la zona x
    public static void ejer1(PilaM M, String x) {
        PilaM pm = new PilaM();
        CSimpleZ cz = new CSimpleZ();
        while (!M.esvacia()) {
            Macrodistrito m = M.eliminar();
            CSimpleZ Z = m.getCz();
            while (!Z.esvacia()) {
                Zona z = Z.eliminar();
                if (z.getNombre().equals(x)) {
                    LDobleE E = z.getLe();
                    NodoE e = E.getP();
                    while (e != null) {
                        e.getE().mostrar();
                        e = e.getSig();
                    }
                    LSimpleF F = z.getLf();
                    NodoF f = F.getP();
                    while (f != null) {
                        f.getF().mostrar();
                        f = f.getSig();
                    }
                }
                cz.adicionar(z);
            }
            Z.vaciar(cz);
            pm.adicionar(m);
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
                Z.vaciar(cz);
            }
            pm.adicionar(m);
        }
        M.vaciar(pm);
        //mostrar todos los arrays
        System.out.println("Nivel 1:");
        mostrar(aux1);
        System.out.println("Nivel 2:");
        mostrar(aux2);
        System.out.println("Nivel 3:");
        mostrar(aux3);
    }
    
    public static void mostrar(ArrayList<String> b){
        Iterator<String> r=b.listIterator();
        while(r.hasNext()){
            String cadx=r.next();
            System.out.println(cadx);
        }
    }
    //Muestrame que tipo de farmacias estan disponibles en la zona con idZona y
    public static void ejer4(PilaM M, int y) {
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
    //verficar si existe alguna farmacia de tipo privado en el macrodistrito x
    /*public static void ejer5(PilaM M, String x) {
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
                Z.vaciar(cz);
            }
            pm.adicionar(m);
        }
        M.vaciar(pm);
        if (c != 0) {
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }
    }*/
    public static void ejer5(PilaM M,String x){
        if(ejer5Recur(M,x))
            System.out.println("Existe");
        else
            System.out.println("No existe");
    }
    
    public static boolean ejer5Recur(PilaM M, String x) {
        if(!M.esvacia()){
            Macrodistrito mx=M.eliminar();
            if(mx.getNombre().equals(x)){
                return EntrarColaZonas(mx.getCz());
            }
            return ejer5Recur(M,x);
        }
        return false;
    }
    public static boolean EntrarColaZonas(CSimpleZ a) {
        if(!a.esvacia()){
            Zona zx=a.eliminar();
            if(verificarFarmacia(zx.getLf().getP()))
                return true;
            return EntrarColaZonas(a);
        }
        return false;
    }
    
    public static boolean verificarFarmacia(NodoF r) {
        if(r!=null){
            if(r.getF().getTipo().equals("Privado"))
                return true;
            return verificarFarmacia(r.getSig());
        }
        return false;
    }
}
