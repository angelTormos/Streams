import java.util.ArrayList;

public class ObjetosTutankamon {
    public static void main(String[] args) {
        ArrayList<Tutankamon> tutankamon = new ArrayList<>();

        tutankamon.add(new Tutankamon("flecha", 5, 1));
        tutankamon.add(new Tutankamon("sandalias", 10, 2));
        tutankamon.add(new Tutankamon("sarcofago", 1000, 1000));
        tutankamon.add(new Tutankamon("mascara", 1000, 10));
        tutankamon.add(new Tutankamon("arco", 10, 2));


        tutankamon.stream()
                .sorted()
                .forEach(System.out::println);
    }
}