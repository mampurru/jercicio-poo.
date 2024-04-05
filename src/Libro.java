public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String editorial;
    private int anioPublicacion;
    private double precio;

    public Libro(String titulo, String autor, String isbn, String editorial, int anioPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }



    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", editorial='" + editorial + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", precio=" + precio +
                '}';
    }
}
