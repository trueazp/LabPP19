import java.util.Scanner;

class Nomor2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x : ");
        int x = in.nextInt();
        System.out.print("Input y : ");
        int y = in.nextInt();
        for (int i = 1; i <= y; i++){
            System.out.print(i + (i % x == 0 ? "\n" : " "));
        } 
        in.close();
    }
}
