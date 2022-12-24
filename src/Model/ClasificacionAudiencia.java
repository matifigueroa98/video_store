
package Model;


public enum ClasificacionAudiencia {
        G, // apto para todo publico
        PG, // sugiere compañia de adulto para menores de 10 años
        PG_13, // sugiere compañia de adulto para menores de 13 años
        R, // Restringido a menores de 17 años si no es con la compañía de un adulto
        NC_17, // Contenido sólo para mayores de 18 años
        UNRATED; // Películas que no han pasado el proceso de calificación
}
