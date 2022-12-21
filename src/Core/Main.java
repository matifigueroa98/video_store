
package Core;

import Model.*;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {
        VideoStore a = new VideoStore (new ArrayList <Alquiler> (), new ArrayList <Cliente>(), new ArrayList <Pelicula>(), "name");
        a.menu();
       

    }
    
}
