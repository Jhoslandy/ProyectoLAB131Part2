/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolab131part2;

/**
 *
 * @author XTREME GAMER
 */
public class PilaS {
    private int max=50;//capacidad
    private Sucursal v[]=new Sucursal[max+1];
    private int tope;
    
    public PilaS(){
        tope=0;
    }
    public boolean esvacia ()
    {
	if (tope == 0)
	    return (true);
	return (false);
    }


    public boolean esllena ()
    {
	if (tope == max)
	    return (true);
	return (false);
    }

    public int nroelem ()
    {
	return (tope);
    }

    public void adicionar (Sucursal elem)
    {
	if (!esllena ())
	{
	    tope++;
	    v [tope] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }

    
    public Sucursal eliminar ()
    {
	Sucursal elem = null;
	if (!esvacia ())
	{
	    elem = v [tope];
	    tope--;
	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }
    

    public void mostrar ()
    {
	Sucursal elem;
	if (esvacia ())
	    System.out.println ("Pila vacia");
	else
	{
	    //System.out.println ("\n Datos de la Pila ");
	    PilaS aux = new PilaS ();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    while (!aux.esvacia ())
	    {
		elem = aux.eliminar ();

		adicionar (elem);
	    }
	}
    }

/*
    void llenar (int n)
    {
	int i;

	for (i = 1 ; i <= n ; i++)
	{
	    Sucursal l = new Sucursal();
	    l.leer();
	    adicionar (l);
	}
    }
*/
/*
    void invertir ()
    {
	PilaS a = new PilaS ();
	PilaS b = new PilaS ();
	while (!esvacia ())
	    a.adicionar (eliminar ());
	while (!a.esvacia ())
	    b.adicionar (a.eliminar ());
	while (!b.esvacia ())
	    adicionar (b.eliminar ());
    }

*/
    
    public void vaciar (PilaS a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
    
}
