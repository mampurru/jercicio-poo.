
import java.util.HashMap;

public class Libreria {
    private HashMap<String, Libro> inventario;

    public Libreria() {
        inventario = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        inventario.put(libro.getTitulo(), libro);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        return inventario.get(titulo);
    }

    public void buscarLibroPorAutor(String autor) {
        for (Libro libro : inventario.values()) {
            if (libro.getAutor().equals(autor)) {
                System.out.println(libro);
            }
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario de la Biblioteca:");
        for (Libro libro : inventario.values()) {
            System.out.println(libro);
        }
    }

    public void realizarPrestamo(String tituloLibro, String nombreUsuario) {
        Libro libro = inventario.get(tituloLibro);
        if (libro != null) {

            System.out.println("Préstamo realizado con éxito para el libro: " + tituloLibro + " a " + nombreUsuario);
        } else {
            System.out.println("El libro no está disponible en el inventario.");
        }
    }

    public void devolverLibro(String tituloLibro) {
        // Implementa lógica para devolver el libro prestado
        System.out.println("Libro devuelto con éxito: " + tituloLibro);
    }
}
