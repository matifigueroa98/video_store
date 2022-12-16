
package Model;


public class Alquiler {
    private String fechaRetiro;
    private String fechaDevolucion;

    public Alquiler(String fechaRetiro, String fechaDevolucion) {
        this.fechaRetiro = fechaRetiro;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
}
