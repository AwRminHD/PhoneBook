public class Address {
    String zipCode;
    String country;
    String city;

    @Override
    public String toString() {
        return "Country: " + country + "\nCity: " + city + "\nZipCode: " + zipCode;
    }
}
