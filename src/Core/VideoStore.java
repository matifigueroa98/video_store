
package Core;

import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class VideoStore {
   private ArrayList <Alquiler> alquilerPeliculas = new ArrayList <>();
   private ArrayList <Cliente> clientes = new ArrayList <>();
   private ArrayList <Pelicula> peliculas = new ArrayList <>();
   private String name;
   private final Scanner entrada = new Scanner (System.in);

    public VideoStore(ArrayList<Alquiler> alquilerPeliculas, ArrayList<Cliente> clientes, ArrayList<Pelicula> peliculas, String name) {
        this.alquilerPeliculas = alquilerPeliculas;
        this.clientes = clientes;
        this.peliculas = peliculas;
        this.name = name;
        this.cargarAlquileres();
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
    
      public void listaDePeliculas (){
          Integer contador = 1;
          System.out.println("----------------------------");
        for (Pelicula p: peliculas){
            System.out.println((contador)+") "+p.getTitulo());
            contador++;
        }
    }
    
    public void agregarCliente (Cliente cliente){
        clientes.add (cliente);
    }
    
    public void agregarAlquiler (Alquiler alquiler){
        alquilerPeliculas.add(alquiler);
    }
    
    public void procedimientoAlquilerDePelicula (){ // a completar...
       String titulo;
       String dni;
       System.out.print("Ingrese el nombre de la pelicula que desea alquilar: ");
       titulo = entrada.nextLine();
        System.out.println("Ingrese su DNI");
       dni = entrada.nextLine();
       if (existenciaPelicula(titulo) == true){
        Pelicula peli = new Pelicula ();
        peli.peliAlquilada();
       } else {
           System.out.println("la pelicula que ha ingresado no existe");
       }
       if (existenciaCliente(dni) == true){
         //  generarBoleta(cliente, peli);
       } else {
           pedirDatosCliente();
       }
       
       
        
    }
    
    public Boolean existenciaPelicula (String pelicula){ 
        Boolean flag = false;   
        for (int i = 0; i< peliculas.size(); i++){
            if (peliculas.get(i).getTitulo().equalsIgnoreCase(pelicula)){
                flag = true;     
            }             
           }
        return flag;
     }
    
     public Boolean existenciaCliente (String dni){ // compruebo si el dni del cliente fue ingresado en el sistema
        Boolean flag = false;   
        for (int i = 0; i< clientes.size(); i++){
            if (clientes.get(i).getDni().equalsIgnoreCase(dni)){
                flag = true;     
            }             
           }
        return flag;
     }
   
   public void pedirDatosCliente (){ // nuevo cliente
       Cliente c = new Cliente ();
       System.out.println("ingrese el nombre del cliente");
       c.setNombre(entrada.nextLine());
       System.out.println("ingrese el DNI del cliente");
       c.setDni(entrada.nextLine());
       System.out.println("ingrese el telefono del cliente");
       c.setTelefono(entrada.nextLine());
       System.out.println("ingrese la direccion del cliente");
       c.setDireccion(entrada.nextLine());
       agregarCliente(c);
       
   }

   public void generarBoleta (Cliente cliente, Pelicula peli){
       Alquiler alquiler = new Alquiler (cliente, peli);
       alquilerPeliculas.add(alquiler);
       //System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(fechaAlquiler)); // obtiene la fecha del alquiler 
       // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
       // System.out.println(formatter.format(fechaDevolucion)); // obtiene la fecha de la devolucion

   }
   
   public void historialAlquileres (Cliente clientes){
       if (clientes.getPelisAlquiladas() != 0){
           System.out.println("HISTORIAL ALQUILERES");
        for (int i=0;i< this.alquilerPeliculas.size();i++){
           // COMPLETAR MAS ADELANTE
       } 
       } else {
           System.out.println("el cliente no alquilo en el VideoStore");
       }
       
   }
   
   public void menu (){
      int menu;
      System.out.println("Bienvenidos al Video Store! Que desea hacer?");
      System.out.println("1. Alquilar pelicula"); 
      System.out.println("2. Ver alquileres vigentes");
      System.out.println("3. Ver lista de peliculas");

      menu = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion"));
      switch (menu){
          case 1: this.procedimientoAlquilerDePelicula(); 
             break; 
          case 2: this.generarBoleta(new Cliente (),new Pelicula ());
             break;
          case 3: this.listaDePeliculas();
             break;
      }
      
      
  }
   
   private void cargarAlquileres(){ // clientes y peliculas existentes
     Cliente cliente1 = new Cliente ("Mati", "40864421", "2236036523", "Calle 321", 0);
     Cliente cliente2 = new Cliente ("Agus", "39456534", "2233464242", "abuela lalala", 0);
     Cliente cliente3 = new Cliente ("Pepe", "38674856", "2235676228", "constitucion 3446", 0);
     Cliente cliente4 = new Cliente ("Fran", "35876756", "2235356991", "Italia 435", 0);
     
       agregarCliente(cliente1);
       agregarCliente(cliente2);
       agregarCliente(cliente3);
       agregarCliente(cliente4);
       
     Pelicula pelicula1 = new Pelicula ("Shrek 3", "18/05/2007",93, "EEUU", "Shrek intenta salvar el reino Muy Muy Lejano", 10, Genero.AVENTURA);
     Pelicula pelicula2 = new Pelicula ("Madagascar", "27/05/2005",86, "EEUU", "Cuatro animales del zoológico de Central Park", 10, Genero.COMEDIA);
     Pelicula pelicula3 = new Pelicula ("Kungu Fu Panda", "03/07/2008",121, "CHINA", "Un panda que come fideos", 10, Genero.ACCION);
     Pelicula pelicula4 = new Pelicula ("Como entrenar a tu dragon 3", "23/11/2019",77, "EEUU", "Hipo y Desdentado buscan un legendario paraíso", 10, Genero.DRAMA);
     
      agregarPelicula(pelicula1); 
      agregarPelicula(pelicula2);
      agregarPelicula(pelicula3);
      agregarPelicula(pelicula4);
   }
   
   private void mostrarGeneros (){
    Integer contador = 1;
    for (Genero i : Genero.values()){
        System.out.println((contador)+". Genero: "+i);
        contador++;
    }
    
}
   
}
