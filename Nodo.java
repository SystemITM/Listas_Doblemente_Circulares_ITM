class Nodo {
    int dato;
    Nodo siguiente;
    Nodo anterior;

    // Constructor para inicializar un nodo
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;  // Aún no tiene un nodo siguiente
        this.anterior = null;   // Aún no tiene un nodo anterior
    }
}
