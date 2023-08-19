package edu.ejercicios;

import comida.Pizza;
import comida.PizzaItaliana;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{




    public static void main(String[] args)
    {
        System.out.println("Hola");
        Pizza pizzaba= new Pizza("basica" , 40.5 );
//        System.out.println("Nombre: " + pizzaba.getNombrePi() + "\nPrecio: " + pizzaba.getPrecio());
//        pizzaba.preparar();
//        System.out.println("Ingredientes de tu pizza:  " + pizzaba.getNombrePi() + "\n" + pizzaba.getIngrediente());


         pizzaba.preparar();
         System.out.println(pizzaba.toString());

        //PIZZA #2

        PizzaItaliana pizzaPro= new PizzaItaliana("Italiana", 69.5, "Buffalo");
//        System.out.println("\n\nNombre: " + pizzaPro.getNombrePi() + "\nPrecio: " + pizzaPro.getPrecio());
//        pizzaPro.preparar();
//        System.out.println("Ingredientes de tu pizza:  " + pizzaPro.getNombrePi() + "\n" + pizzaPro.getIngrediente() + "\n" + pizzaPro.getSalsa());

        System.out.println("\n\n");
        pizzaPro.preparar();
        System.out.println("\n\n" + pizzaPro.toString());
        pizzaPro.tiempoCo();

    }





}
