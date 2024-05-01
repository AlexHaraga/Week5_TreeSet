package Week5;

import Week5.Utility.Hired;
import Week5.Utility.Student;
import Week5.Utility.Unemployed;
import Week5.Utility.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Student student = new Student("Name 1", "123", 10);
        final Hired hired = new Hired("Name 2", "234", 11);
        final Unemployed unemployed = new Unemployed("Name 3", "2345", 12);

        List<Person> persons = new ArrayList<>();
        List<Person> persons2 = new ArrayList<>();


        System.out.println("ArrayList example");

        persons.add(student);
        persons.add(hired);
        persons.add(unemployed);
        persons.remove(hired);

        for (int i = 0; i < persons.size(); i++) {
            persons.get(i).print();
        }

        System.out.println();

        for (Person person : persons) {
            person.print();
            if (person instanceof Student) {
                ((Student) person).hasExam();
            }
        }

        System.out.println();
        System.out.println("LinkedList example");

        List<Person> personsLinked = new LinkedList<>();
        personsLinked.add(student);
        personsLinked.add(hired);
        personsLinked.add(unemployed);
        personsLinked.remove(hired);

        for (int i = 0; i < personsLinked.size(); i++) {
            personsLinked.get(i).print();
        }

        System.out.println();

        for (Person person : personsLinked) {
            person.print();
        }
    }
}
