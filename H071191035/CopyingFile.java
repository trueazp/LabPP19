import java.io.*;
import java.util.Scanner;

public class CopyingFile {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        FileInputStream in = null;
        FileOutputStream out = null;
    
        String s = key.nextLine() + ".txt";
        String ss = key.nextLine() + ".txt";

        try {
            in = new FileInputStream(s);
            out = new FileOutputStream(ss);
            int data;

            while ((data = in.read()) != -1) {
                out.write(data);
            }      

            out.flush();
            System.out.println("Berhasil");
        } catch (IOException e) {
            System.out.println("Fail");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
        }
        key.close();
    }
}