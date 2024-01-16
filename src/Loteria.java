public class Loteria implements Comparable<Loteria>{
    private int inversion;
    private int premio;

    public Loteria(int inversion, int premio) {
        this.inversion = inversion;
        this.premio = premio;
    }

    public int getInversion() {
        return this.inversion;
    }

    public int getPremio() {
        return this.premio;
    }

    @Override
    public String toString() {
        if (this.inversion < this.premio) {
            return "Si";
        } else {
            return "No";
        }
    }

    @Override
    public int compareTo(Loteria loteria) {
        if (this.inversion == loteria.getInversion()) {
            return 1;
        } else if (this.inversion > loteria.getInversion()) {
            return -1;
        } else {
            return 0;
        }
    }
}
