
package Model;


public class Pelicula {
    
private String titulo;
private String fechaDeLanzamiento;
private Integer duracionEnMinutos;
private String paisDeOrigen;
private String descripcion;
private Integer copiasDisponibles;
private Genero genero;
private Integer vecesAlquilada; 

    public Pelicula(String titulo, String fechaDeLanzamiento, Integer duracionEnMinutos, 
            String paisDeOrigen, String descripcion, Integer copiasDisponibles, Genero genero, Integer vecesAlquilada) {
        this.titulo = titulo;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracionEnMinutos = duracionEnMinutos;
        this.paisDeOrigen = paisDeOrigen;
        this.descripcion = descripcion;
        this.copiasDisponibles = copiasDisponibles;
        this.genero = genero;
        this.vecesAlquilada = vecesAlquilada = 0;
    }

    public Pelicula() {
    }
    
    public String verPelicula (){ 
        return "Titulo: "+titulo+"\nFecha de lanzamiento: " + fechaDeLanzamiento + "\nDuracion: " +
        duracionEnMinutos + "\nPais de origen: " + paisDeOrigen + "\nDescripcion: " + descripcion + "\nCopias Disponibles: " + copiasDisponibles + "\nGenero: "
        + genero;
    }
    
    public void peliAlquilada (){ // cuando se alquila una pelicula se aumenta el contador de las veces alquiladas y se saca una del stock
        this.copiasDisponibles--;
        this.vecesAlquilada++;
    }
    
    public Integer verificarCopiasDisponibles() { // verifico cantidad de copias disponibles en stock
        Integer copias = 0;
        if (this.copiasDisponibles > 0) {
        copias = this.copiasDisponibles;
        }
        return copias;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(String fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Integer getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(Integer duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(Integer copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Integer getVecesAlquilada() {
        return vecesAlquilada;
    }

    public void setVecesAlquilada(Integer vecesAlquilada) {
        this.vecesAlquilada = vecesAlquilada;
    }
}
