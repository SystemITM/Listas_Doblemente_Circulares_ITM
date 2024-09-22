public class UsoDoblementeCircular {
    public static void main(String[] args) {
        ListaDobleCircular lista = new ListaDobleCircular();

        // Insertamos elementos en la lista
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);

        // Mostramos los elementos de la lista
        System.out.println("Elementos de la lista:");
        lista.mostrarLista();

        // Eliminamos un elemento
        lista.eliminar(20);
        System.out.println("Después de eliminar 20:");
        lista.mostrarLista();

        // Eliminamos otro elemento
        lista.eliminar(10);
        System.out.println("Después de eliminar 10:");
        lista.mostrarLista();

        
    }
}
