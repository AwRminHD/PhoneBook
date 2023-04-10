import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        PhoneBook phonebook = new PhoneBook();
        while (true) {
            String input = inp.nextLine();
            String[] com = input.split(" ");
            if (com[0].equals("contacts")) {
                if (com[1].equals("-a")) {
                    String firstname = com[2];
                    String lastname = com[3];
                    System.out.println("Please enter contact's group");
                    String group = inp.nextLine();
                    System.out.println("Please enter contact's email");
                    String email = inp.nextLine();
                    System.out.println("Please enter contact's code");
                    String contrycode = inp.nextLine();
                    System.out.println("Please enter contact's number");
                    String number = inp.nextLine();
                    System.out.println("Please enter contact's zip code");
                    String zipcode = inp.nextLine();
                    System.out.println("Please enter contact's country");
                    String country = inp.nextLine();
                    System.out.println("Please enter contact's city");
                    String city = inp.nextLine();
                    System.out.println("Contact saved!");
                    Address ad = new Address(zipcode, country, city);
                    PhoneNumber Pnumber = new PhoneNumber(contrycode, number);
                    Contact con = new Contact(city, email, firstname, lastname, Pnumber, ad)
                    phonebook.addContact(con);
                }
                if (com[1].equals("-r")) {
                    String firstname = com[2]
                    String lastname = com[3];
                    
                    phonebook.deleteContact(firstname, lastname);
                }
            }
            else if (com[0].equals("show")) {
                if (com[1].equals("-g")) {
                    String gp = com[2];
                    Contact[] output = phonebook.findContacts(gp);
                    for (int i = 0; i < output.length; i++)
                        System.out.println(output[i]);
            
                }
                else if (com[1].equals("-c")) {
                    String firstname = com[2];
                    String lastname = com[3];

                    System.out.println(phonebook.findContact(firstname, lastname));
                }
                else {
                    phonebook.printContacts();
                }
            }
            else if (com[0].equals("exit"))
                break;   
        }
        inp.close();
    }   
}
