package OOPpart1;

import java.util.ArrayList;

public class PeopleList {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        {
            people.add("Vasiliy");
            people.add("Zinaida");
            people.add("Petr");
            people.add("Oleg");
            people.add("Anton");
        }
        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {
            System.out.println(person);
        }

    }
}
