import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StateCapitalGame {
    public static void main(String[] args) {

        //create initial variables
        Scanner userinput = new Scanner(System.in);

        //create the file to hold the game data
        FileHolder fileHolder = new FileHolder("capital_game_data.txt");

        //need a list to hold the values (?)
        //See about getting the state capital data from Prof Soares
        List<Capital> statesList = new ArrayList<>();
        statesList.add(new Capital("California", "Los Angeles"));
        statesList.add(new Capital("Georgia", "Atlanta"));
        statesList.add(new Capital("Texas", "Houston"));

        System.out.println("Welcome to our State Capital game!");
        System.out.println("Type 'quit' or 'end' at any time to stop.\n");

        //start of giant while loop to run program
        while (true) {

            //get initial data from the user
            System.out.print("Enter your username: ");
            String name = userinput.nextLine();

            //ends program if end or quit is entered
            if (name.equalsIgnoreCase("quit") || name.equalsIgnoreCase("end")) {
                System.out.println("\nThe game has been ended. Thanks for playing!");
                break;
            }

            //make our User object to hold user data
            User user = new User(name);

            //adds the user to the text file capital_game_data.txt with simple exception catch
            try {
                fileHolder.writeLine("User started: " + user.getName());
            } catch (IOException e) {
                System.out.println("Error writing to log file.");
            }

            //still need to make the questions section but want to see about getting
            //a master list of state capitals to figure out how to do it (probably from .txt file?)


        }
    }
}
