import java.util.ArrayList;
import java.util.List;

public class Premios {
    public static void main(String[] args) {
        ArrayList<Loteria> loteria = new ArrayList<>();

        loteria.add(new Loteria(9, 4));
        loteria.add(new Loteria(10, 6));
        loteria.add(new Loteria(9, 5));
        loteria.add(new Loteria(1, 3000));
        System.out.println(esJusto(loteria));

        loteria = new ArrayList<>();
        loteria.add(new Loteria(10, 5));
        loteria.add(new Loteria(20, 4));
        loteria.add(new Loteria(30, 5));
        System.out.println(esJusto(loteria));

    }

    public static String esJusto(List<Loteria> loteria) {
        for (int i = 0; i < loteria.size(); i++) {
            if (loteria.get(i).getInversion() > loteria.get(i + 1).getInversion()){
                if (loteria.get(i).getPremio() < loteria.get(i + 1).getPremio()){
                    return "NO";
                }
            } else if (loteria.get(i).getInversion() < loteria.get(i + 1).getInversion()) {
                if (loteria.get(i).getPremio() >= loteria.get(i + 1).getPremio()){
                    return "NO";
                }
            }
            return "SI";
        }
        return null;
    }
}