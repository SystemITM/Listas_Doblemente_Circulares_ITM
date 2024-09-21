class ListaDobleCircular {

    // Nodo cabeza que apunta al primer elemento de la lista
    private Nodo cabeza;

    // Método para insertar un nuevo nodo al final de la lista
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);

        // Si la lista está vacía
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;  // La lista apunta a sí misma (circularidad)
            cabeza.anterior = cabeza;
        } else {
            // Si la lista no está vacía
            Nodo ultimo = cabeza.anterior;  // Obtenemos el último nodo

            // Insertamos el nuevo nodo al final
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = cabeza;  // El nuevo nodo apunta al principio
            cabeza.anterior = nuevo;   // El primer nodo apunta al nuevo nodo como el último
        }
    }

    // Método para mostrar los elementos de la lista
    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;

        do {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println();
    }

    // Método para eliminar un nodo por su valor
    public void eliminar(int valor) {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;

        // Buscamos el nodo a eliminar
        do {
            if (actual.dato == valor) {
                if (actual == cabeza && actual.siguiente == cabeza) {
                    // Caso especial: si solo hay un nodo en la lista
                    cabeza = null;
                } else {
                    Nodo anterior = actual.anterior;
                    Nodo siguiente = actual.siguiente;

                    anterior.siguiente = siguiente;
                    siguiente.anterior = anterior;

                    // Si eliminamos la cabeza, actualizamos la referencia
                    if (actual == cabeza) {
                        cabeza = siguiente;
                    }
                }
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("El valor no se encontró en la lista");
    }
}

