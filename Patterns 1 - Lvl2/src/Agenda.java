import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Telephone> telephones = new ArrayList<>();
    private List<Address> addresses = new ArrayList<>();

    public void addContact(AbstractFactory factory, String city, String street, String building, String floor, String door, String number) {
         Telephone telephone = factory.addTelephone(number);
         Address address = factory.addAddress(city, street, building, floor, door);
         telephones.add(telephone);
         addresses.add(address);
    }

    public void showContacts() {
        System.out.println("Contacts: ");
        for (int i = 0; i < telephones.size(); i++) {
            System.out.println("Telephones:");
            System.out.println(telephones.get(i).format());
            System.out.println("Addresses:");
            System.out.println(addresses.get(i).format());
        }
    }

}