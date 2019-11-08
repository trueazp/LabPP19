import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Input height : ");
        int n = key.nextInt();

        System.out.println("Result : ");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            } 
            for (int k = 1; k <= (2*i) - 1; k++) {
                System.out.print("*");
            } 
            System.out.println();
        }
        key.close();
    }
}