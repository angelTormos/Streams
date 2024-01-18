import java.util.ArrayList;

public class Felipe {
    public static void main(String[] args) {
        ArrayList<Tarea> tarea = new ArrayList<>();

        tarea.add(new Tarea(5, 3));
        tarea.add(new Tarea(8, 8));
        tarea.add(new Tarea(2, 5));
        tarea.add(new Tarea(5, 2));

        tarea.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
