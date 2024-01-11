import java.util.ArrayList;

public class Problema2 {

        public static void main(String[] args) {
            ArrayList<Person> personas = new ArrayList<>();
            Person persona = new Person("Pepe", "García", 1968);
            personas.add(persona);
            persona = new Person("María", "Alvarez", 1998);
            personas.add(persona);
            persona = new Person("Juan", "Martínez", 1968);
            personas.add(persona);

            long count = personas.stream()
                    .filter(person -> person.getLastName().startsWith("A") )
                    .count();
            System.out.println(count + " pesronas su apellido empieza en A");

        }
    }
