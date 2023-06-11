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
        LDobleE le1=new LDobleE();
        EstablecimientoDeSalud e1= new EstablecimientoDeSalud("Pro Mujer","C. Canonigo Ayllon","ONGs",2,"Clinica");
        EstablecimientoDeSalud e2= new EstablecimientoDeSalud("El Carmen","C. Canonigo A. Pza. el Carmen","ONGs",3,"Hospital");
        EstablecimientoDeSalud e3= new EstablecimientoDeSalud("Bajo San Pedro","C. General Gonzales #1328","publico",1,"Hospital");
        le1.adiFinal(e1); le1.adiFinal(e2); le1.adiFinal(e3);
        
        LDobleE le2=new LDobleE();
        EstablecimientoDeSalud e4= new EstablecimientoDeSalud("Medi Health","Av. Sánchez Lima 2326","ONGs",1,"Hospital");
        EstablecimientoDeSalud e5= new EstablecimientoDeSalud("Caja petrolera","Av. 6 de Agosto","ONGs",2,"Clinica");
        EstablecimientoDeSalud e6= new EstablecimientoDeSalud("SS Universitario","Av. 6 de Agosto","privado",1,"Hospital");
        le2.adiFinal(e1); le2.adiFinal(e2); le2.adiFinal(e3);
        
        LDobleE le3=new LDobleE();
        EstablecimientoDeSalud e7= new EstablecimientoDeSalud("Arcoiris","C. 15 de abril","publico",2,"Hospital");
        EstablecimientoDeSalud e8= new EstablecimientoDeSalud("La merced","C. Villa Aspiazu","publico",1,"Hospital");
        EstablecimientoDeSalud e9= new EstablecimientoDeSalud("Caja petrolera","C. Miguel Aparicio","publico",1,"Clinica");
        le3.adiFinal(e1); le3.adiFinal(e2); le3.adiFinal(e3);
        
        LSimpleF lf1 = new LSimpleF();
        PilaS ps1 = new PilaS();
        Sucursal s1=new Sucursal("central","avenida1");
        ps1.adicionar(s1);
        Farmacia f1=new Farmacia("La glorieta","publico",ps1);

        PilaS ps2 = new PilaS();
        Sucursal s2=new Sucursal("Plaza San Pedro","calle 2");
        Sucursal s3=new Sucursal("Teleferico","calle 3");
        ps2.adicionar(s2); ps2.adicionar(s3);
        Farmacia f2=new Farmacia("Mi Farma","institucional",ps2);
        
        PilaS ps3 = new PilaS();
        Sucursal s4=new Sucursal("San Pedro","calle 4");
        Sucursal s5=new Sucursal("Rotonda","calle 7");
        ps3.adicionar(s4); ps3.adicionar(s5);
        Farmacia f3=new Farmacia("Angel Samuel","publico",ps3);
        
        lf1.adiPrincipio(f1); lf1.adiPrincipio(f2); lf1.adiPrincipio(f3);
        
        
        LSimpleF lf2 = new LSimpleF();
        PilaS ps4 = new PilaS();
        Sucursal s6=new Sucursal("central","avenida 9");
        ps4.adicionar(s1);
        Farmacia f4=new Farmacia("Victoria","hospitalaria",ps4);

        PilaS ps5 = new PilaS();
        Sucursal s7=new Sucursal("Plaza España","calle 2");
        Sucursal s8=new Sucursal("Plaza Avaroa","avenida 3");
        ps5.adicionar(s2); ps5.adicionar(s3);
        Farmacia f5=new Farmacia("Mi Farma","institucional",ps5);
        
        PilaS ps6 = new PilaS();
        Sucursal s9=new Sucursal("Plaza España","avenida 4");
        Sucursal s10=new Sucursal("6 de agosto","calle 7");
        ps6.adicionar(s4); ps6.adicionar(s5);
        Farmacia f6=new Farmacia("Beni","publico",ps6);
        
        lf2.adiPrincipio(f4); lf2.adiPrincipio(f5); lf2.adiPrincipio(f6);
        
        
        CCircularZ cz1=new CCircularZ();
        Zona z1=new Zona("San Pedro",lf1,le1,3455);
        Zona z2=new Zona("Sopocachi",lf2,le2,2288);
        cz1.adicionar(z1); cz1.adicionar(z2);
        
        
        PilaM m1=new PilaM();
        Macrodistrito ma1 = new Macrodistrito("Centro",15534,cz1);
        m1.adicionar(ma1);
        m1.mostrar();
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
                        if (e.getE().getNivel()==(1)) {
                            //array nivel1
                        }
                        if (e.getE().getNivel()==(2)){
                            //array nivel 2
                        }
                        if (e.getE().getNivel()==(3)){
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
