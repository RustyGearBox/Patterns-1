public interface AbstractFactory {
    Telephone addTelephone(String number);
    Address addAddress(String city, String street, String building, String floor, String door);
}
