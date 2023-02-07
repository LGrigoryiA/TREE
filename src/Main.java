import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> notables = new ArrayList<>(notable());
        System.out.println(notables);
        Collections.sort(notables, new PersonComparator(4));
        System.out.println(notables);
    }

    public static List<Person> notable() {
        List<Person> notable = new LinkedList<>();
        notable.add(new Person("Olya", "Sidorova-Sidorova-Sidorova-Sidorova ", 5));
        notable.add(new Person("Anya", "Petrova", 7));
        notable.add(new Person("Kolya", "Kozlov", 2));
        notable.add(new Person("Tolya", "Ivanov-Ivanov Ivanov Ivanov Ivanov", 1));
        notable.add(new Person("Andrey", "Капитан Vodogrey", 12));
        return (List<Person>) notable;
    }
}

