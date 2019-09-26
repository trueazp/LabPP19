import java.util.Scanner;

class Nomor2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x : ");
        int x = in.nextInt();
        System.out.print("Input y : ");
        int y = in.nextInt();
        int num = 1;
        for (int  i = 0; i <= x; i++) {
            System.out.print(num + " ");
            for (int j = 0; j <= y; j++) {
                System.out.println(num + "\n ");
                num++;
            }
        }
        in.close();
    }
}