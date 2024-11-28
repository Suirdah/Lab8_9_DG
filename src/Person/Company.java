package Person;

public class Company {
    private String name;
    private int year;

    public Company(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person.Company{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
