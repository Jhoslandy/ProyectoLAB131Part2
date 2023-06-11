/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolab131part2;

/**
 *
 * @author XTREME GAMER
 */
public class CCircularZ {
    private int max=350;
    private Zona v[]=new Zona[max+1];
    private int ini,fin;
    CCircularZ()
    {
        ini=fin=0;
    }
    int nroelem ()
    {
	return ((max + fin - ini) % max);
    }
    boolean esvacia ()
    {
	if (nroelem () == 0)
	    return (true);
	return (false);
    }
    boolean esllena ()
    {
	if (nroelem () == max - 1)
	    return (true);
	return (false);
    }
    void adicionar (Zona elem)
    {
	if (!esllena ())
	{

	    fin = (fin + 1) % max;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola circular llena");
    }
    Zona eliminar ()
    {
	Zona elem = null;
	if (!esvacia ())
	{
	    ini = (ini + 1) % max;
	    elem = v [ini];
	    if (nroelem () == 0)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola circular vacia");
	return (elem);
    }
    void mostrar ()
    {
	if (esvacia ())
	    System.out.println ("Cola vacia xxx");
	else
	{
	    //System.out.println ("\n Zonas de la Cola ");
	    CCircularZ aux = new CCircularZ ();
	    while (!esvacia ())
	    {
		Zona elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
                System.out.println ("=================================");
	    }
	    vaciar(aux);
	}
    }
    void vaciar (CCircularZ a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
    }
    /*
    void leer(int n){
        int i;

	for (i = 1 ; i <= n ; i++)
	{
	    Zona l = new Zona();
	    l.leer();
	    adicionar (l);
	}
    }
    */
}
