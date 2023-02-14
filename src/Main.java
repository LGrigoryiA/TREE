import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> notables = new ArrayList<>(notable());
        System.out.println(notables);
        int max = 4;

        Comparator<Person> comparator;
        comparator = (Person o1, Person o2) -> {
            int surnameOne = o1.getSurname().split("\\P{IsAlphabetic}+").length;
            int surnameTwo = o2.getSurname().split("\\P{IsAlphabetic}+").length;
            if (surnameOne >= max && surnameTwo >= max) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            if (surnameOne > surnameTwo) {
                return 1;
            } else if (surnameOne == surnameTwo) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return -1;
            }
        };
        Collections.sort(notables, comparator);
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

