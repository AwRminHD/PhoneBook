import java.util.ArrayList;

public class PhoneBook {
    private ArrayList <Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    boolean addContact(Contact contact) {
        for (Contact check: contacts) 
            if (check.equals(contact))
                return false;
        
        contacts.add(contact);
        return true;
    }
    boolean deleteContact(String firstName, String LastName) {
        for (Contact check: contacts) {
            if (check.getFirst().equals(firstName) && check.getLast().equals(LastName)) {
                contacts.remove(check);
                return true;
            }
        }
        return false;
    }
    Contact findContact(String firstname, String lastname) {
        for (Contact check: contacts) {
            if (check.getFirst().equals(firstname) && check.getLast().equals(lastname))
                return check;
        }
        return null;
    }
    Contact[] findContacts(String group) {
        ArrayList <Contact> res = new ArrayList<>();
        for (Contact check: contacts) {
            if (check.getGroup().equals(group))
                res.add(check);
        }

        return (Contact[])res.toArray();
    }
    void printContacts() {
        for (Contact con: contacts)
            System.out.println(con);    
    }
}
