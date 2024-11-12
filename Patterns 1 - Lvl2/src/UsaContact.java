public class UsaContact {

    public class UsaTelephone implements Telephone {
        private String number;

        public UsaTelephone(String numero) {
            this.number = numero;
        }

        @Override
        public String format() {
            return "+1 " + number;
        }
    }

    public class UsaAddress implements Address {
        private String city;
        private String street;
        private String building;
        private String floor;
        private String door;

        public UsaAddress(String city, String street, String building, String floor, String door) {
            this.city = city;
            this.street = street;
            this.building = building;
            this.floor = floor;
            this.door = door;
        }

        @Override
        public String format() {
            return "USA, " + city + ", " + street + ", " + building + ", " + floor + "º, " + door +"ª.";
        }
    }

    public class UsaFactory implements AbstractFactory {
        @Override
        public Telephone addTelephone(String number) {
            return new UsaContact.UsaTelephone(number);
        }

        @Override
        public Address addAddress(String city, String street, String building, String floor, String door) {
            return new UsaContact.UsaAddress(city, street, building, floor, door);
        }
    }

}