public class Tareas implements Comparable<Tareas>{
    private int prioridad;
    private int duracion;

    public Tareas(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public int getDuracion() {
        return this.duracion;
    }

    @Override
    public String toString() {
        return this.getPrioridad() + " (" + this.getDuracion() + ")";
    }

    @Override
    public int compareTo(Tareas tareas) {
        if (this.prioridad == tareas.getPrioridad()) {
            if (this.duracion > tareas.duracion){
                return -1;
            }else {
                return 1;
            }
        } else if (this.prioridad > tareas.getPrioridad()) {
            return -1;
        } else {
            return 1;
        }
    }
}
