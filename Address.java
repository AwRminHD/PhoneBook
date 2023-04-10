public class Address {
    String zipCode;
    String country;
    String city;

    public Address(String zipCode, String country, String city) {
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Country: " + country + "\nCity: " + city + "\nZipCode: " + zipCode;
    }
}
