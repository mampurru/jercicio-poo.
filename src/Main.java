import java.util.Scanner;
//integrantes :cesar toro,emmanuel patiño ,oscar andres colorado.

public class Main {
    public static void main(String[] args) {
        Libreria biblioteca = new Libreria();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Agregar Nuevo Libro");
            System.out.println("2. Buscar Libro por Título");
            System.out.println("3. Buscar Libro por Autor");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Realizar Préstamo");
            System.out.println("6. Devolver Libro Prestado");
            System.out.println("7. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese el título del libro:");
                    scanner.nextLine();
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el autor del libro:");
                    String autor = scanner.nextLine();
                    System.out.println("Ingrese el ISBN del libro:");
                    String isbn = scanner.nextLine();
                    System.out.println("Ingrese la editorial del libro:");
                    String editorial = scanner.nextLine();
                    System.out.println("Ingrese el año de publicación del libro:");
                    int anioPublicacion = scanner.nextInt();
                    System.out.println("Ingrese el precio del libro:");
                    double precio = scanner.nextDouble();

                    Libro nuevoLibro = new Libro(titulo, autor, isbn, editorial, anioPublicacion, precio);
                    biblioteca.agregarLibro(nuevoLibro);
                    break;
                case 2:

                    System.out.println("Ingrese el título del libro a buscar:");
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    String tituloBusqueda = scanner.nextLine();
                    Libro libroEncontradoTitulo = biblioteca.buscarLibroPorTitulo(tituloBusqueda);
                    if (libroEncontradoTitulo != null) {
                        System.out.println("Libro encontrado: " + libroEncontradoTitulo);
                    } else {
                        System.out.println("Libro no encontrado en el inventario.");
                    }
                    break;
                case 3:

                    System.out.println("Ingrese el autor del libro a buscar:");
                    scanner.nextLine();
                    String autorBusqueda = scanner.nextLine();
                    biblioteca.buscarLibroPorAutor(autorBusqueda);
                    break;
                case 4:

                    biblioteca.mostrarInventario();
                    break;
                case 5:

                    System.out.println("Ingrese el título del libro a prestar:");
                    scanner.nextLine();
                    String tituloPrestamo = scanner.nextLine();
                    System.out.println("Ingrese el nombre del usuario:");
                    String nombreUsuario = scanner.nextLine();
                    biblioteca.realizarPrestamo(tituloPrestamo, nombreUsuario);
                    break;
                case 6:

                    System.out.println("Ingrese el título del libro a devolver:");
                    scanner.nextLine();
                    String tituloDevolucion = scanner.nextLine();
                    biblioteca.devolverLibro(tituloDevolucion);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número válido.");

            }
        } while (opcion != 7);
        scanner.close();
    }
}
