public class Tutankamon implements Comparable<Tutankamon> {
    private String nombre;
    private int valor;
    private int peso;

    public Tutankamon(String nombre, int valor, int peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getValor() {
        return this.valor;
    }

    public int getPeso() {
        return this.peso;
    }


    @Override
    public String toString() {
        return this.getNombre();
    }

    @Override
    public int compareTo(Tutankamon tutankamon) {
        if (this.valor == tutankamon.getValor()) {
            if (this.peso > tutankamon.getPeso()){
                return 1;
            } else if (this.peso < tutankamon.getPeso()) {
                return -1;
            }else{
                return 1;
            }
        } else if (this.valor > tutankamon.getValor()) {
            return -1;
        } else {
            return 1;
        }
    }
}
