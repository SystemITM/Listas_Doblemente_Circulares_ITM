import java.util.Scanner;
public class ElegirYReproducirMusica {
public static void main(String[] args) {
        ReproductorMusica reproductor = new ReproductorMusica();

        // Agregamos canciones al reproductor
        reproductor.agregarCancion("La vaca lola");
        reproductor.agregarCancion("Pinpon");
        reproductor.agregarCancion("los pollitos dicen");
        reproductor.agregarCancion("Rammstein");

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nOpciones:");
            System.out.println("1. Reproducir canción actual");
            System.out.println("2. Siguiente canción");
            System.out.println("3. Canción anterior");
            System.out.println("4. Elegir canción por nombre");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    reproductor.reproducir();
                    break;
                case 2:
                    reproductor.siguienteCancion();
                    break;
                case 3:
                    reproductor.anteriorCancion();
                    break;
                case 4:
                    System.out.print("Introduce el nombre de la canción: ");
                    String nombre = scanner.nextLine();
                    reproductor.elegirCancion(nombre);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
    
}