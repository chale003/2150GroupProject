import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileHolder {
    //should handle all the inputs and outputs
    private final String logPath;

    public FileHolder(String logPath){
        this.logPath = logPath;
    }
    public void writeLine (String line) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(logPath, true))){
            bw.write(line);
            bw.newLine();
        }catch (IOException e){
            System.out.println("Error writing to log: " + e.getMessage());
        }
    }
    // tester array list
    public static List<Capital> seedAsArrayList(){
        List <Capital> list = new ArrayList<>();
        list.add (new Capital("California", "Sacramento"));
        list.add (new Capital("Georgia", "Atlanta"));
        list.add (new Capital("Alaska", "Juneau"));
        return list;
    }
    // tester linkedlist
    public static LinkedList<Capital> seedAsLinkedList() {
        LinkedList<Capital> list = new LinkedList<>();
        list.add(new Capital("California", "Sacramento"));
        list.add(new Capital("Georgia", "Atlanta"));
        list.add(new Capital("Alaska", "Juneau"));
        return list;
    }

}
