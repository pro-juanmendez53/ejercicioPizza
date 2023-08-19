package comida;

public class Pizza
{

   private String nombrePi;

    Double precio;
    String ingrediente= "\nQueso\nTomate\nJamon";
    public String getIngrediente()
    {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getNombrePi() {
        return nombrePi;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setNombrePi(String nombrePi) {
        this.nombrePi = nombrePi;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

   public void preparar()
   {
       System.out.println("La pizza esta lista para comer.");
   }





    public Pizza (String nombrePi, Double precio)
    {
        this.nombrePi=nombrePi;
        this.precio=precio;

    }
    @Override
    public String toString()
    {
        return "Nombre: " + getNombrePi() + "\nPrecio: " + getPrecio() + "\nIngredientes: " + getIngrediente();
    }






}
