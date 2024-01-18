
public class Loteria implements Comparable<Loteria> {
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
        public int compareTo(Loteria loteria) {
            if (this.inversion == loteria.getInversion()) {
                if (this.premio > loteria.premio){
                    return -1;
                }else {
                    return 1;
                }
            } else if (this.inversion > loteria.getInversion()) {
                return -1;
            } else {
                return 1;
            }
        }

}
