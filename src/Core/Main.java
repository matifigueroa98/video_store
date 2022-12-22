
package Core;

import Model.*;
import java.util.ArrayList;


public class Main { 
    public static void main(String[] args) {
        VideoStore roberto = new VideoStore (new ArrayList <Alquiler>(), new ArrayList <Cliente>(), new ArrayList <Pelicula>(), "Blockbuster");
       roberto.menu();
      

    }
    
}
