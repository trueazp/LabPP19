import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int n = key.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
                arr[i] = key.nextInt();
                }
        for (int i = 0, x; i < arr.length; i++) {
            x = 1;
            x += i;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] % arr[x] != 0 && arr[x] % arr[i] != 0) {
                    System.out.println(arr[i] + " " + arr[x]);
                }
                x++;
            }
            n--;
        }
    }
}