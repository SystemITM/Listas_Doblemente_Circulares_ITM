// Nodo que representa una canción en el reproductor
class Cancion {
    String nombre;
    Cancion siguiente;
    Cancion anterior;

    // Constructor para inicializar la canción con un nombre
    public Cancion(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
        this.anterior = null;
    }
}
