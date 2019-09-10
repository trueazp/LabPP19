import java.util.Scanner;

class LatihanPraktikum3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai a : ");
        int a = in.nextInt();
        System.out.print("Masukkan nilai b : ");
        int b = in.nextInt();
        
        boolean kebenaran = a % b;
        System.out.print("Apakah " + a + " kelipatan dari " + b +" ? " + kebenaran);
    }
}
