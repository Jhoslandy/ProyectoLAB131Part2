/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectolab131part2;

/**
 *
 * @author XTREME GAMER
 */
public class ProyectoLAB131Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    //mostrar los hospitales y farmacias de la zona x
    public static void ejer1(PilaM M, String x) {
        PilaM pm = new PilaM();
        CCircularZ cz = new CCircularZ();
        while (!M.esvacia()) {
            Macrodistrito maux = M.eliminar();
            CCircularZ Z = maux.getCz();
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
                Z.adicionar(zaux);
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
        CCircularZ cz = new CCircularZ();
        PilaS ps = new PilaS();
        int c = 0;
        while (!M.esvacia()) {
            Macrodistrito m = M.eliminar();
            CCircularZ Z = m.getCz();
            while (!Z.esvacia()) {
                Zona z = Z.eliminar();
                LSimpleF F = z.getLf();
                NodoF f = F.getP();
                while (f != null) {
                    if (f.getF().getNombre().equals(x)) {
                        System.out.println("Zona: " + z);
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
        CCircularZ cz = new CCircularZ();
        
        while (!M.esvacia()) {
            Macrodistrito m = M.eliminar();
            if (m.getNombre().equals(x)) {
                CCircularZ Z = m.getCz();
                while (!Z.esvacia()) {
                    Zona z = Z.eliminar();
                    LDobleE E = z.getLe();
                    NodoE e = E.getP();
                    while (e != null) {
                        if (e.getE().getNivel().equals(1)) {
                            //array nivel1
                        }
                        if (e.getE().getNivel().equals(2)){
                            //array nivel 2
                        }
                        if (e.getE().getNivel().equals(3)){
                            //array nivel 3
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
    }

    //verficar si existe alguna farmacia de tipo privado en el macrodistrito x
    public static void ejer4(PilaM M,String x) {
        PilaM pm = new PilaM();
        CCircularZ cz = new CCircularZ();
        int c=0;
        while (!M.esvacia()) {
            Macrodistrito m = M.eliminar();
            if (m.getNombre().equals(x)) {
                CCircularZ Z = m.getCz();
                while (!Z.esvacia()) {
                    Zona z = Z.eliminar();
                    LSimpleF F = z.getLf();
                    NodoF f = F.getP();
                    while (f != null) {
                        if(f.getF().getTipo().equals("Privado")){
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
        if(c!=0){
            System.out.println("Existe");
        }
        else{
            System.out.println("No existe");
        }
    }

    //mostrar los hospitales y farmacias de la zona x
    public static void ejer5() {

    }

    //
    public static void ejer6() {

    }
}
