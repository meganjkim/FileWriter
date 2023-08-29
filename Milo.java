import java.util.*;
import java.io.*;

public class Milo {
    public void writeToFile(String s) throws IOException {
        String fileName = "milo.txt";
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        pw.print(s);
        pw.close();
    }

    public String readFromFile() throws IOException {
        String fileName = "milobear.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String s = br.readLine();
        br.close();
        return s;
    }
}
