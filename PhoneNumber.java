public class PhoneNumber {
    String CountryCode;
    String number;

    @Override
    public String toString() {
        return CountryCode + " " + number;
    }
}
