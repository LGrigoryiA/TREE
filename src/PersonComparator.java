import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int max;
    public PersonComparator(int max) {
        this.max = max;
    }

    @Override
    public int compare(Person o1, Person o2) {
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
    }
}
