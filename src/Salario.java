import java.util.ArrayList;
import java.util.List;

public class Salario {
    public static void main(String[] args) {
        ArrayList<Human> trabajador = new ArrayList<>();

        trabajador.add(new Human("Pablo", 1500));
        trabajador.add(new Human("Adrian", 2300));
        trabajador.add(new Human("Alberto", 1050));
        trabajador.add(new Human("Marcos", 2000));

        trabajador.stream()
                .sorted()
                .forEach(System.out::println);
    }
}