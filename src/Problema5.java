import java.util.ArrayList;
import java.util.Scanner;

public class Problema5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> numeros = new ArrayList<>();
            System.out.println("Introduce varios numeros (numero negativo para parar)");
            int numero;
            while (scanner.hasNextInt()){
                numero = scanner.nextInt();
                numeros.add(numero);
                if (numero < 0){
                    break;
                }
            }

            numeros.stream()
                    .filter(n -> n > 1 & n < 5)
                    .forEach(System.out::println);
        }
    }


