import java.util.Scanner;

class Nomor3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Berapa deret bilangan yang ingin dicetak ? ");
        long n = in.nextLong();
        long fibo1 = 1, fibo2 = 0, fn = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(fn + " ");
            fn = fibo1 + fibo2;
            fibo2 = fibo1;
            fibo1 = fn;
        }
        in.close();
    }
}