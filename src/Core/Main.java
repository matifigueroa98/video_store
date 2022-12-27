
package Core;

import Model.*;
import java.util.ArrayList;


public class Main { 
    public static void main(String[] args) {
       ArrayList <Alquiler> alquilerPeliculas = new ArrayList <>();
       ArrayList <Cliente> clientes = new ArrayList <>();
       ArrayList <Pelicula> peliculas = new ArrayList <>();
       
        VideoStore roberto = new VideoStore (alquilerPeliculas,clientes,peliculas, "Blockbuster");
       roberto.menu();
      

    }
    
}
