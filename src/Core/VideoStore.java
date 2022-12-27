
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
        this.cargarDatos();
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
    
    public void verAlquileresVigentes (){
        for (Alquiler alquiler: alquilerPeliculas){
            if (alquiler.consultarVigencia() != -1){
                alquiler.mostrarAlquiler();
            }
        }
    }
    
    public void procedimientoAlquilerDePelicula (){ // a completar...
       
       Cliente client = procedimientoAgregarCliente();
       Pelicula movie = procedimientoAgregarPelicula();
     
      }
    
    public Pelicula procedimientoAgregarPelicula (){
       String titulo;
       Pelicula movieExist = null;
       Cliente client = procedimientoAgregarCliente();
       
       do{
        System.out.print("Ingrese el nombre de la pelicula que desea alquilar: ");
        titulo = entrada.nextLine();
        movieExist = existenciaPelicula(titulo);
            if (movieExist != null){
              generarBoleta(client, movieExist); 
              System.out.println("Se ha solicitado la pelicula: "+movieExist.getTitulo());
              movieExist.peliAlquilada();
            } else {
              System.out.println("la pelicula que ha ingresado no existe, por favor vuelva a intentar"); 
              }   
        } while (movieExist == null);
      
       return movieExist;
    }
      
    public Cliente  procedimientoAgregarCliente (){
         String dni;
         Cliente client = null;
       
         do { // procedimiento para agregar cliente
            System.out.print("Ingrese su DNI: ");
            dni = entrada.nextLine();
            client = buscarCliente(dni);
            if (client == null){
                
              Integer newClient;
              System.out.println("No se encuentra en el sistema de clientes. Desea agregar un nuevo cliente?");
              System.out.println("Ingrese '1' si asi lo desea, '2' para volver a iniciar");
              newClient = entrada.nextInt();
              entrada.nextLine(); // Scanner clean
              switch (newClient){
                case 1 -> client = altaDeCliente();
              }
            }
        }while (client == null);
         
         return client;
    }
    
    
    public Cliente buscarCliente (String dni){ // encontrar el dni del cliente mediante el toFind
        Cliente toFind = null;   
        for (int i = 0; i< clientes.size(); i++){
            if (clientes.get(i).getDni().equalsIgnoreCase(dni)){
                toFind = clientes.get(i);     
            }             
           }
        return toFind;
     }
    
    public Pelicula existenciaPelicula (String pelicula){ // encontrar la pelicula mediante el toFind
        Pelicula toFind = null;   
        for (int i = 0; i< peliculas.size(); i++){
            if (peliculas.get(i).getTitulo().equalsIgnoreCase(pelicula)){
                toFind = peliculas.get(i);     
            }             
           }
        return toFind;
     }
    
//     public Boolean existenciaCliente (String dni){ // compruebo si el dni del cliente fue ingresado en el sistema
//        Boolean flag = false;   
//        for (int i = 0; i< clientes.size(); i++){
//            if (clientes.get(i).getDni().equalsIgnoreCase(dni)){
//                flag = true;     
//            }             
//           }
//        return flag;
//     }
   
   public Cliente altaDeCliente (){ // nuevo cliente
       Cliente c = new Cliente (); 
       System.out.println("Por favor ingrese los datos del NUEVO cliente");
       System.out.println("--------------------------------------------");
       System.out.print("Ingrese el nombre del cliente: ");
       c.setNombre(entrada.nextLine());
       System.out.print("Ingrese el DNI del cliente: ");
       c.setDni(entrada.nextLine());
       System.out.print("Ingrese el telefono del cliente: ");
       c.setTelefono(entrada.nextLine());
       System.out.print("Ingrese la direccion del cliente: ");
       c.setDireccion(entrada.nextLine());
       clientes.add(c);
       
       return c;
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
      JOptionPane.showMessageDialog(null, "Bienvenidos al Video Store! Que desea hacer? \n\n"
              + "1. Alquilar pelicula \n2. Ver alquileres vigente \n3. Ver lista de peliculas");

      menu = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion"));
      switch (menu){
          case 1: this.procedimientoAlquilerDePelicula(); 
             break; 
          case 2: this.verAlquileresVigentes();
             break;
          case 3: this.listaDePeliculas();
             break;
          case 4: procedimientoAgregarCliente(); // test
      }
      
      
  }
   
   private void cargarDatos(){ // clientes y peliculas existentes
     Cliente cliente1 = new Cliente ("Mati", "40864421", "2236036523", "Calle 321", 0);
     Cliente cliente2 = new Cliente ("Agus", "39456534", "2233464242", "abuela lalala", 0);
     Cliente cliente3 = new Cliente ("Pepe", "38674856", "2235676228", "constitucion 3446", 0);
     Cliente cliente4 = new Cliente ("Fran", "35876756", "2235356991", "Italia 435", 0);
     
       agregarCliente(cliente1);
       agregarCliente(cliente2);
       agregarCliente(cliente3);
       agregarCliente(cliente4);
       
     Pelicula pelicula1 = new Pelicula ("Shrek 3", "18/05/2007",93, "EEUU", "Shrek intenta salvar el reino Muy Muy Lejano", 0, Genero.AVENTURA);
     Pelicula pelicula2 = new Pelicula ("Madagascar", "27/05/2005",86, "EEUU", "Cuatro animales del zoológico de Central Park", 2, Genero.COMEDIA);
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
