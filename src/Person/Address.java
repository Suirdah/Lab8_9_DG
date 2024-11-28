package Person;

public class Address {
    private String street;
    private String flatNO;
    private String houseNO;
    private String postalCode;
    private String city;
    private String country;

    public Address(String street, String flatNO, String houseNO, String postalCode, String city, String country) {
        this.street = street;
        this.flatNO = flatNO;
        this.houseNO = houseNO;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person.Person.Address{" +
                "street='" + street + '\'' +
                ", flatNO=" + flatNO +
                ", houseNO='" + houseNO + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
