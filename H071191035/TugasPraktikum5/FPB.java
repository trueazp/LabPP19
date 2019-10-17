import java.util.Scanner;

class FPB {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int m = key.nextInt();
        int n = key.nextInt();
        System.out.println("FPB : " + fpb(m,n));
        key.close();
    }
    public static int fpb (int a, int b) {
        do {
        int c = b;
        b = a % b;
        a = c;
        } while ( b != 0);
        return a;
    }
}