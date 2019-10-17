import java.util.Scanner;
import java.util.Random;

class SerialNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int m = key.nextInt();
        String serialNumber = generateSerial(n,m);
        System.out.println(serialNumber);
    }

    public static String generateSerial (int x, int y) {
        String str = "";
        Random obj = new Random();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int k = obj.nextInt(10);
                str += k;
            }
            if (i < x - 1) {
                str += "-";
            }
        }
        return str;
    }
}