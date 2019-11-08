import java.io.*;
import java.util.*;

public class CopyingAlignRight {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String source1 = key.nextLine() + ".txt";
        String source2 = key.nextLine() + ".txt";

        FileReader in = null;
        FileWriter out = null;
        BufferedReader reader = null;
        PrintWriter writer = null;

        try {

            in = new FileReader(source1);
            out = new FileWriter(source2);
            
            ArrayList<String> lines = new ArrayList<>();
            reader = new BufferedReader(in);
            writer = new PrintWriter(out);
            int maxLength = Integer.MIN_VALUE;
                
                for (String str = reader.readLine(); str != null; str = reader.readLine()) {
                    str = str.replace("\t", "    ");
                    lines.add(str);
                    maxLength = Math.max(maxLength, str.length());
                }

                String formatter = String.format("%%%ds\n", maxLength);
                for (String str : lines) {
                    if (str.length() > 0) {
                        writer.printf(formatter, str);
                    }
                    else {
                        writer.println();
                    }
                }
                writer.flush();
                System.out.println("Success");
                
        } catch (IOException ioe) {
            System.out.println("Fail");
            System.out.println(ioe.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
                System.exit(1);
            }
        }
        key.close();
    }
}