import java.util.ArrayList;

public class Problema3 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person("María", "Alvarez", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        personas.add(persona);
        persona = new Person("Alberto", "García", 1968);
        personas.add(persona);

        personas.stream()
                .map(Person::getFirstName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}