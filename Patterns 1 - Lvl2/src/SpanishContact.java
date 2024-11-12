public class SpanishContact {

    public class SpainTelephone implements Telephone {
        private String number;

        public SpainTelephone(String numero) {
            this.number = numero;
        }

        @Override
        public String format() {
            return "+34 " + number;
        }
    }

    public class SpainAddress implements Address {
        private String city;
        private String street;
        private String building;
        private String floor;
        private String door;

        public SpainAddress(String city, String street, String building, String floor, String door) {
            this.city = city;
            this.street = street;
            this.building = building;
            this.floor = floor;
            this.door = door;
        }

        @Override
        public String format() {
            return "Spain, " + city + ", " + street + ", " + building + ", " + floor + "º, " + door +"ª.";
        }
    }

    public class FactorySpain implements AbstractFactory {
        @Override
        public Telephone addTelephone(String number) {
            return new SpainTelephone(number);
        }

        @Override
        public Address addAddress(String city, String street, String building, String floor, String door) {
            return new SpainAddress(city, street, building, floor, door);
        }
    }

}