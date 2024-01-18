import java.util.ArrayList;

public class Regalos {

    public static void main(String[] args) {
        ArrayList<Ninosbuenos> ninosbuenos = new ArrayList<>();

        ninosbuenos.add(new Ninosbuenos(80, 2));
        ninosbuenos.add(new Ninosbuenos(100, 12));
        ninosbuenos.add(new Ninosbuenos(100, 1));

        ninosbuenos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}