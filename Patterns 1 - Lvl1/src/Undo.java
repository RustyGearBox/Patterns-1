import java.util.ArrayList;

public class Undo {

    private static Undo instance;

    private ArrayList<String> commands;

    private Undo(){
        commands = new ArrayList<>();
    }

    public static Undo getInstance(){
        if (instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command){
        commands.add(command);
        System.out.println("The command has been added successfully");
    }

    public void removeLastCommand(){
        if (!commands.isEmpty()){
            commands.remove(commands.size()-1);
            System.out.println("The last command has been successfully deleted");
        }else {
            System.out.println("The command couldn't been deleted");
        }
    }

    public void listCommand(){
        if (!commands.isEmpty()){
            for (String s : commands) {
                System.out.println("- " + s);
            }
        }else {
            System.out.println("The command list couldn't be showed");
        }
    }
}
