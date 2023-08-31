import java.util.*;
import java.io.*;

public class Milo {
    public void writeToFile(String s, String name) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(name)));
        pw.print(s);
        pw.close();
    }

    public String readFromFile(String name) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(name));
        String s = br.readLine();
        br.close();
        return s;
    }
}
