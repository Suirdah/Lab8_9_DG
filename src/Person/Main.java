package Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataGenerator generator = new DataGenerator();
        List<Person> people = generator.generatePeopleList(10);
        for(Person person : people){
            System.out.println(person);
        }
    }
}