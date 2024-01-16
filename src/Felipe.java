import java.util.ArrayList;

public class Felipe {
    public static void main(String[] args) {
        ArrayList<Tareas> tarea = new ArrayList<>();

        tarea.add(new Tareas(5, 3));
        tarea.add(new Tareas(8, 8));
        tarea.add(new Tareas(2, 5));
        tarea.add(new Tareas(5, 2));

        tarea.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
