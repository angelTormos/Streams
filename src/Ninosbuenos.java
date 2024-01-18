public class Ninosbuenos implements Comparable<Ninosbuenos> {
    private int bondad;
    private int peso;

    public Ninosbuenos(int bondad, int peso) {
        this.bondad = bondad;
        this.peso = peso;
    }

    public int getBondad() {
        return this.bondad;
    }

    public int getPeso() {
        return this.peso;
    }

    @Override
    public String toString() {
        return this.getBondad() + " " + this.getPeso();
    }

    @Override
    public int compareTo(Ninosbuenos ninosbuenos) {
        if (this.bondad == ninosbuenos.getBondad()) {
            if (this.peso < ninosbuenos.peso) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.bondad > ninosbuenos.getBondad()) {
            return -1;
        } else {
            return 1;
        }
    }
}