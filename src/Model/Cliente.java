
package Model;

import java.util.ArrayList;

public class Cliente {
    
private String nombre;
private String dni;
private String telefono; 
private String direccion;
private Integer pelisAlquiladas;
private ArrayList <Alquiler> alquileres = new ArrayList <>();

    public Cliente(String nombre,String dni, String telefono, String direccion, Integer pelisAlquiladas) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.pelisAlquiladas = pelisAlquiladas = 0;
    }

    public Cliente() {
    }
    
     public void mostrarUltimosDiezAlquileres(){   
        for (int i=0; i < 10; i++){
          this.alquileres.get(i).mostrarAlquiler();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    } 

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getPelisAlquiladas() {
        return pelisAlquiladas;
    }

    public void setPelisAlquiladas(Integer pelisAlquiladas) {
        this.pelisAlquiladas = pelisAlquiladas;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }   
}
