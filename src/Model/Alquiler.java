
package Model;

import java.util.Date;


public class Alquiler {
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Cliente cliente;
    private Pelicula pelicula;

    public Alquiler(Date fechaAlquiler, Date fechaDevolucion, Cliente cliente, Pelicula pelicula) {
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.cliente = cliente;
        this.pelicula = pelicula;
    }
    

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
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
