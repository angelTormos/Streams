import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SumaPositivosNegativos {
    public static void main(String[] args) {
        List<Integer>numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(-20);
        numeros.add(-25);

        long positivos = numeros.stream()
                .filter(num -> num > 0)
                .count();

        long negativos = numeros.stream()
                .filter(num -> num < 0)
                .count();

        int suma = numeros.stream()
                .mapToInt(Integer::valueOf)
                .sum();


        System.out.println("Hay " + positivos + " numeros positivos y " + negativos + " numeros negativos, la suma de todos los numeros es de: " + suma);

    }
}
