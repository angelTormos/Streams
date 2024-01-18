public class Tarea implements Comparable<Tarea>{
    private int prioridad;
    private int duracion;

    public Tarea(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public int getNombre() {
        return this.prioridad;
    }

    public int getDuracion() {
        return this.duracion;
    }

    @Override
    public String toString() {
        return this.getNombre() + " (" + this.getDuracion() + ")";
    }

    @Override
    public int compareTo(Tarea tarea) {
        if (this.prioridad == tarea.getNombre()) {
            if (this.duracion > tarea.duracion){
                return -1;
            }else {
                return 1;
            }
        } else if (this.prioridad > tarea.getNombre()) {
            return -1;
        } else {
            return 1;
        }
    }
}
