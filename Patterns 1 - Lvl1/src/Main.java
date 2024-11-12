import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Undo undo = Undo.getInstance();

    public static void main(String[] args) {

        while(true) {
            System.out.println("\nCommand menu:");
            System.out.println("1. add command");
            System.out.println("2. delete last command");
            System.out.println("3. list commands");
            System.out.println("0. exit\n");

            System.out.print("Which option do you want to do: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Type de command to add it: ");
                    String command = scanner.next();
                    undo.addCommand(command);
                    break;
                case 2:
                    undo.removeLastCommand();
                    break;
                case 3:
                    undo.listCommand();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}