
package Model;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Cliente cliente;
    private Pelicula pelicula;

    public Alquiler(Cliente cliente, Pelicula pelicula) {
        this.fechaAlquiler = fechaAlquiler.now();
        this.fechaDevolucion = fechaAlquiler.plusDays(3);
        this.cliente = cliente;
        this.pelicula = pelicula;
    }
    
    public void mostrarAlquiler (){
        System.out.println("El cliente: "+this.cliente.getNombre()+" alquiló "+this.pelicula.getTitulo());
    } 
    
    public int consultarVigencia() { //devuelve -1 si esta vencido, >= 0 si esta vigente
        int vigencia = this.fechaDevolucion.compareTo(LocalDate.now());
        return vigencia;
    }
    

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}
