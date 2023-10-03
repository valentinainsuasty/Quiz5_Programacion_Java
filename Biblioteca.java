import java.util.LinkedList;

/**
 * clase Biblioteca
 */
public class Biblioteca {
    /**
     * Atributos
     */
    LinkedList<Libro> librosDisponibles = new LinkedList<>();

    /**
     * Método que sirve para registrar los libros
     *
     * @param libro
     *
     * Complejidad teporal: 0(1) tiempo constante
     */
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    /**
     * Método que sirve para buscar el libro
     *
     * @param titulo
     * @return libro buscado
     *
     * Complejidad temporal: 0(N) tiempo lineal
     */
    public Libro buscarLibro(String titulo) {
        for (int i=0; i<librosDisponibles.size(); i++){
            Libro libroBuscado = librosDisponibles.get(i);
            if(libroBuscado.getTitulo().equals(titulo)){
                return libroBuscado;
            }
        }
        return null;
    }

    /**
     * Método para mostrar el libro
     *
     * @return los libros disponibles
     *
     * Complejidad temporal: 0(1) tiempo constante
     */
    public LinkedList<Libro> mostrarLibrosDisponibles () {
        return librosDisponibles;
    }
}