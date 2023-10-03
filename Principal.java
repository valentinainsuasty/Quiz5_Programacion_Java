public class Principal {
    /**
     * Primera clase que se ejecuta
     * @param args
     *
     * Complejidad temporal: 0(1) tiempo constante
     */
    public static void main(String[] args) {
        /**
         *Se crea objeto bibliotecaKonradLorenz
         */
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();
        /**
         *Se crea objeto cienAnosSoledad
         */

        Libro cienAnosSoledad = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        bibliotecaKonradLorenz.registrarLibro(cienAnosSoledad);
        /**
         * Se crea objeto codigoDaVinci
         */
        Libro codigoDaVinci = new Libro("El código Da Vinci","Dan Brown", 656);
        bibliotecaKonradLorenz.registrarLibro(codigoDaVinci);
        /**
         * Se crea objeto numero
         */
        Libro numero = new Libro("1984","George Orwell",326);
        bibliotecaKonradLorenz.registrarLibro(numero);
        /**
         * Se crea objeto hobbit
         */
        Libro hobbit = new Libro("El Hobbit","J.R.R. Tolkien", 310);
        bibliotecaKonradLorenz.registrarLibro(hobbit);
        /**
         * Se crea objeto odisea
         */
        Libro odisea = new Libro("La Odisea","Homero",448);
        bibliotecaKonradLorenz.registrarLibro(odisea);

    }
}
