public class Contact {
    String group, email;
    String firstName, lastName;
    
    PhoneNumber phone;
    Address address;

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
}
