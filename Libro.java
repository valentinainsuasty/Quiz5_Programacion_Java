/**
 * clase Libro
 */
public class Libro {
    /**
     * Atributos
     */
    private String titulo;
    private String autor;
    private int numeroPaginas;
    /**
     * Mètodos
     */
    /**
     * Constructor para inicializar los atributos
     *
     * @param titulo
     * @param autor
     * @param numeroPaginas
     *
     * Complejidad temporal: 0(1) tiempo constante
     */
    public Libro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Mètodo getter que permite obtener el título del libro
     * @return título del libro
     *
     * complejidad temporal: 0(1) tiempo constante
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Mètodo getter que permite obtener el autor del libro
     * @return título del libro
     *
     * complejidad temporal: 0(1) tiempo constante
     */
    public String getAutor() {
        return autor;
    }
    /**
     * Mètodo getter que permite obtener el número de páginas del libro
     * @return título del libro
     *
     * complejidad temporal: 0(1) tiempo constante
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    /**
     * Mètodo getter que permite cambiar el título del libro
     * @return título del libro
     *
     * complejidad temporal: 0(1) tiempo constante
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Mètodo getter que permite cambiar el autor del libro
     * @return título del libro
     *
     * complejidad temporal: 0(1) tiempo constante
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * Mètodo getter que permite cambiar el número de páginas del libro
     * @return título del libro
     *
     * complejidad temporal: 0(1) tiempo constante
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}