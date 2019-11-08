import java.io.*;
import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        FileOutputStream out = null;
        PrintWriter writer = null;

        System.out.print("Input file name : ");
        String str = key.nextLine() + ".txt";
        
        System.out.print("Input how much data : ");
        int n = key.nextInt();

        String name[] = new String[n];
        String nim[] = new String[n];
        String year[] = new String[n];

        int maxName = 4;
        int maxNim = 3;
        int maxYear = 8;

        for (int i = 0; i < n; i++) {

            String names = key.next().replaceAll("_", " ");
            name[i] = names.substring(0, Math.min(names.length(), 20));
            maxName = Math.max(maxName, name[i].length());

            String nims = key.next();
            nim[i] = nims.substring(0, Math.min(nims.length(), 10));
            maxNim = Math.max(maxNim, nim[i].length());

            year[i] = String.valueOf(key.nextInt());
            maxYear = Math.max(maxYear, year[i].length());
        }
        
        try {

            out = new FileOutputStream(str);
            writer = new PrintWriter(out);
            
            String formatter = String.format("| %%-%ds | %%-%ds | %%-%ds |\n", maxName, maxNim, maxYear);
       
            String border = String.format("+-%s-+-%s-+-%s-+", rep('-', maxName), rep('-', maxNim), rep('-', maxYear));

            writer.println(border);
            writer.printf(formatter, "Nama", "NIM", "Angkatan");
            writer.println(border);

            for (int i = 0; i < n; i++) {
                writer.printf(formatter, name[i], nim[i], year[i]);
            }
            writer.println(border);
            writer.flush();
            System.out.println("Success");

        } catch (IOException ioe) {
            System.out.println("Fail");
            System.out.println(ioe.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
                System.exit(1);
            }
        }
        key.close();
    }

    //method menduplikasi char menjadi String
    static String rep(char c, int n) {
        char chars[] = new char[n];
        Arrays.fill(chars, c);
        return new String(chars);
    }
}