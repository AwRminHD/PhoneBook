public class PhoneNumber {
    String CountryCode;
    String number;

    public PhoneNumber(String CountryCode, String number) {
        this.CountryCode = CountryCode;
        this.number = number;
    }
    @Override
    public String toString() {
        return CountryCode + " " + number;
    }
}
