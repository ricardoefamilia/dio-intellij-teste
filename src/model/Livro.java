package model;

public class Livro {

    private String titulo;
    private int nrPag;

    public Livro(String titulo, int nrPag) {
        this.titulo = titulo;
        this.nrPag = nrPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNrPag() {
        return nrPag;
    }

    public void setNrPag(int nrPag) {
        this.nrPag = nrPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", nrPag=" + nrPag +
                '}';
    }
}
