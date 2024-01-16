public class Pais implements Comparable<Pais> {
    private String nombre;
    private int indice;

    public Pais(String nombre, int indice) {
        this.nombre = nombre;
        this.indice = indice;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getIndice() { return this.indice;
    }

    @Override
    public String toString() {
        return this.getNombre() + " (" + this.getIndice() + ")";
    }

    @Override
    public int compareTo(Pais pais) {
        if (this.indice == pais.getIndice()) {
            return 0;
        } else if (this.indice > pais.getIndice()) {
            return -1;
        } else {
            return 1;
        }
    }
}
