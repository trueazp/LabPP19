import java.util.Scanner;

class SameElement {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        try {

        int n = key.nextInt();
        int[] arr = new int[n];
        int sameElement = 0;
        int sum1 = 0;
        int sum2 = 0;
        boolean truth = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = key.nextInt();
        }
        
        for (int j = 0, x = 0, y = n - 1; j < 2*n; j++) {
            x = 0;
            x = j + 1;
            for (int k = 0; k < n; k++) {
                if (arr[j] == arr[x]) {
                    truth = true;
                    sameElement = arr[j];
                    sum1 = j;
                    sum2 = x;
                }
                x++;
            }
            n--;
        }
        System.out.println(truth);

        if (truth == true) {
            System.out.println("Elemen yang sama yaitu " + sameElement + " ditemukan pada indeks ke" + sum2 + " dan ke" + sum1);
        }
        else {
            System.out.println("Tidak ada elemen yang sama");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}