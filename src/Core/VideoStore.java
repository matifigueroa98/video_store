
package Core;

import Model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class VideoStore {
   private ArrayList <Alquiler> alquilerPeliculas;
   private ArrayList <Cliente> clientes;
   private ArrayList <Pelicula> peliculas;
   private String name;
   private final Scanner entrada = new Scanner (System.in);

    public VideoStore(ArrayList<Alquiler> alquilerPeliculas, ArrayList<Cliente> clientes, ArrayList<Pelicula> peliculas, String name) {
        this.alquilerPeliculas = alquilerPeliculas;
        this.clientes = clientes;
        this.peliculas = peliculas;
        this.name = name;
    }

    public VideoStore() {
    }

    public ArrayList<Alquiler> getAlquilerPeliculas() {
        return alquilerPeliculas;
    }

    public void setAlquilerPeliculas(ArrayList<Alquiler> alquilerPeliculas) {
        this.alquilerPeliculas = alquilerPeliculas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void agregarPelicula (Pelicula pelicula){
        peliculas.add(pelicula);
    }
    
    public void agregarCliente (Cliente cliente){
        clientes.add (cliente);
    }
    
    public void agregarAlquiler (Alquiler alquiler){
        alquilerPeliculas.add(alquiler);
    }

   public void alquilarPelicula () {
       String titulo;
       System.out.print("ingrese el nombre de la pelicula que desea alquilar: ");
       titulo = entrada.nextLine();
   }

   public void generarBoleta (Cliente cliente, Pelicula peli){
       Date dato = new Date ();
       // inicializar fechaDev
       Alquiler alquiler = new Alquiler (dato, fechaDev, cliente, peli);
       alquilerPeliculas.add(alquiler);
       System.out.println("alquiler "+alquiler.getFechaAlquiler());
       
   }
   
   
   
   public void historialAlquileres (Cliente clientes){
       if (clientes.getPelisAlquiladas() != 0){
        // completar
       } else {
           System.out.println("el cliente no alquilo en el VideoStore");
       }
       
   }
   
   public void menu (){
      int menu;
      System.out.println("Bienvenidos al Video Store! Que desea hacer?");
      System.out.println("1. Alquilar pelicula"); 
      System.out.println("2. Ver alquileres vigentes");
      menu = entrada.nextInt();
      switch (menu){
          case 1: mostrarGeneros ();
                
              break;
          case 2: generarBoleta(new Cliente (),new Pelicula ());
      }
      
      
  }
  
  private void cargarPeliculas(){
      
  }
  private void mostrarGeneros (){
    Integer contador = 1;
    for (Genero i : Genero.values()){
        System.out.println((contador)+". Genero: "+i);
        contador++;
    }
    
}
   
}
