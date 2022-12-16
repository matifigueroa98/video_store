
package Model;


public class Pelicula {
    
private String titulo;
private String fechaDeLanzamiento;
private Integer duracionEnMinutos;
private String paisDeOrigen;
private String descripcion;

    public Pelicula(String titulo, String fechaDeLanzamiento, Integer duracionEnMinutos, String clasificacionAudiencia, String paisDeOrigen, String descripcion) {
        this.titulo = titulo;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracionEnMinutos = duracionEnMinutos;
        this.paisDeOrigen = paisDeOrigen;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public Integer getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

public enum clasificacionAudiencia {
        G,
        PG,
        PG_13,
        R,
        NC_17,
        UNRATED;
}
}
