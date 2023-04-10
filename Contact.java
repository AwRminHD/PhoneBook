public class Contact {
    private String group, email;
    private String firstName, lastName;
    
    private PhoneNumber phone;
    private Address address;

    public Contact(String gp, String email, String Fname, String Lname, PhoneNumber phone, Address address) {
        this.group = gp;
        this.email = email;
        this.firstName = Fname;
        this.lastName = Lname;
        this.phone = phone;
        this.address = address;        
    }
    
    @Override 
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Contact))
            return false;
        
        Contact a = (Contact) obj;
        return a.firstName.equals(firstName) && a.lastName.equals(lastName);
    }
    @Override
    public String toString() {
        return "first name: " + firstName + "\nlast name: " + lastName + "\nemail: " + email;
    }
    public String getGroup() {
        return group;
    }
    public String getFirst() {
        return firstName;
    }
    public String getLast() {
        return lastName;
    }
}
