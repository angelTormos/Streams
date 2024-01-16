import java.util.ArrayList;

public class Premios {
    public static void main(String[] args) {
        ArrayList<Loteria> loteria = new ArrayList<>();

        loteria.add(new Loteria(9, 4));
        loteria.add(new Loteria(10, 6));
        loteria.add(new Loteria(9, 5));
        loteria.add(new Loteria(1, 3));

        if (){

        }

        loteria.stream()
                .sorted()
                .forEach(System.out::println);
    }
}