package Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    private static final String[] NAMES = {"Anna", "John", "James", "Robert", "Elizabeth"};
    private static final String[] SURNAMES = {"Smith", "Johnson", "Brown", "Williams", "Jones", "Garcia"};
    private static final String[] JOBS = {"Engineer", "Teacher", "Developer", "Doctor", "Artist", "Manager"};
    private static final String[] COMPANIES = {"TechPro", "HealthCo", "EduSoft", "BuildWell", "DesignPro"};
    private static final String[] STREET = {"Person.Main Street", "Elm Street", "Maple Avenue", "Broadway"};
    private static final String[] CITIES = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
    private static final String COUNTRY = "USA";


    public List<Person> generatePeopleList(int n) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            people.add(generatePerson());
        }
        return people;
    }

    public Person generatePerson() {
        Random losow = new Random();
        return new Person(NAMES[losow.nextInt(NAMES.length)],
                SURNAMES[losow.nextInt(SURNAMES.length)],
                losow.nextBoolean() ? "Male" : "Female",
                1960 + losow.nextInt(42),
                JOBS[losow.nextInt(JOBS.length)],
                generateCompany(),
                3000 + losow.nextDouble() * 5000,
                generateAddress()
        );
    }

    private Company generateCompany() {
        Random losow = new Random();
        return new Company(COMPANIES[losow.nextInt(COMPANIES.length)],
                1900 + losow.nextInt(123)
        );
    }

    private Address generateAddress() {
        Random losow = new Random();
        return new Address(STREET[losow.nextInt(STREET.length)],
                String.valueOf(1+ losow.nextInt(50)),
                String.valueOf(1+ losow.nextInt(200)),
                String.format("%05d", losow.nextInt(100000)),
                CITIES[losow.nextInt(CITIES.length)],
                COUNTRY
                );
    }
}
