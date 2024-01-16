import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Analfabetos {
    public static void main(String[] args) throws IOException {
        ArrayList<Pais> analfabetos = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("Archivos/illiterate.csv"));
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] actual = line.split(",");
            String pais = actual[5];
            String indice = actual [8];
            analfabetos.add(new Pais(pais, Integer.parseInt(indice)));
        }
        analfabetos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}