package proyectolab131part2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author XTREME GAMER
 */
public class PilaM {
    private int max=50;//capacidad
    private Macrodistrito v[]=new Macrodistrito[max+1];
    private int tope;
    
    public PilaM(){
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

    public void adicionar (Macrodistrito elem)
    {
	if (!esllena ())
	{
	    tope++;
	    v [tope] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }

    
    public Macrodistrito eliminar ()
    {
	Macrodistrito elem = null;
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
	Macrodistrito elem;
	if (esvacia ())
	    System.out.println ("Pila vacia");
	else
	{
	    //System.out.println ("\n Datos de la Pila ");
	    PilaM aux = new PilaM ();
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
	    Macrodistrito l = new Macrodistrito();
	    l.leer();
	    adicionar (l);
	}
    }
*/
/*
    void invertir ()
    {
	PilaM a = new PilaM ();
	PilaM b = new PilaM ();
	while (!esvacia ())
	    a.adicionar (eliminar ());
	while (!a.esvacia ())
	    b.adicionar (a.eliminar ());
	while (!b.esvacia ())
	    adicionar (b.eliminar ());
    }

*/
    public void vaciar (PilaM a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
}
