package comida;

public class PizzaItaliana extends Pizza
{

    public String salsa;
    public String getSalsa()
    {
     return salsa;
    }
    public void setSalsa(String salsa)
    {
        this.salsa = salsa;
    }

    public void tiempoCo()
    {
        System.out.println("Tu pizza se preparo en 25 minutos");
    }

    public PizzaItaliana(String nombrePi, Double precio, String salsa)
    { super (nombrePi, precio) ;
        this.salsa= salsa;
    }

    @Override
    public String toString()
    {
        return "Nombre: " + getNombrePi() + "\nPrecio: " + getPrecio() + "\nIngredientes: " + getIngrediente() + "\nSalsa: " + getSalsa();
    }



}
