// Clase que representa la lista doblemente enlazada circular para las canciones
class ReproductorMusica {
    private Cancion actual;  // La canción que se está reproduciendo actualmente

    // Método para insertar una nueva canción en la lista
    public void agregarCancion(String nombre) {
        Cancion nuevaCancion = new Cancion(nombre);

        // Si no hay canciones en la lista
        if (actual == null) {
            actual = nuevaCancion;
            actual.siguiente = actual;  // Circularidad
            actual.anterior = actual;
        } else {
            // Agregamos la nueva canción al final
            Cancion ultima = actual.anterior;

            ultima.siguiente = nuevaCancion;
            nuevaCancion.anterior = ultima;
            nuevaCancion.siguiente = actual;  // Circular: la nueva canción apunta a la primera
            actual.anterior = nuevaCancion;   // La primera canción apunta a la nueva como la última
        }
    }

    // Método para reproducir la canción actual
    public void reproducir() {
        if (actual != null) {
            System.out.println("Reproduciendo: " + actual.nombre);
        } else {
            System.out.println("No hay canciones en la lista.");
        }
    }

    // Método para saltar a la siguiente canción
    public void siguienteCancion() {
        if (actual != null) {
            actual = actual.siguiente;
            reproducir();
        }
    }

    // Método para ir a la canción anterior
    public void anteriorCancion() {
        if (actual != null) {
            actual = actual.anterior;
            reproducir();
        }
    }

    // Método para buscar una canción por su nombre y reproducirla
    public void elegirCancion(String nombre) {
        if (actual == null) {
            System.out.println("No hay canciones en la lista.");
            return;
        }

        Cancion temp = actual;
        do {
            if (temp.nombre.equalsIgnoreCase(nombre)) {
                actual = temp;  // Encontramos la canción y la hacemos actual
                reproducir();
                return;
            }
            temp = temp.siguiente;
        } while (temp != actual);

        System.out.println("La canción '" + nombre + "' no fue encontrada.");
    }
}