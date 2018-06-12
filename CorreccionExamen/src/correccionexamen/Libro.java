package correccionexamen;
/**
 *
 * @author Oswaldo
 */
public class Libro {
    
    private String titulo;
    private int anio;
    private boolean favorito;
    private Autor autor;

    public Libro(String titulo, int anio, boolean favorito, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.favorito = favorito;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAño() {
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    
    @Override
    public String toString() {
        return "Titulo: " + this.titulo + "\nNombre de autor: " + this.autor + "\nAño: "+this.anio;
        
    }
}
