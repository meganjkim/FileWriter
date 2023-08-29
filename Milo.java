import java.util.*;
import java.io.*;

public class Milo {
    public static void writeToFile(String s, String fileName) throws IOException {
        // String fileName = "milo.txt";
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        pw.print(s);
        pw.close();
    }

    public static String readFromFile(String fileName) throws IOException {
        // String fileName = "milobear.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String s = br.readLine();
        br.close();
        return s;
    }
    public static int countCharacters (String fileName) throws IOException
    {
        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while (br.ready())
        {
            br.read();
            count++;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        // writeToFile("milo","milo.txt");
        System.out.println(readFromFile ("milo.txt"));
        System.out.println(countCharacters("milo.txt"));
    }
}
