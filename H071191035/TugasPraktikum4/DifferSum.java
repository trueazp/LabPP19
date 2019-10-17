import java.util.Scanner;

class DifferSum {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("(Matrix 1)Input length : ");
        int m = key.nextInt();
        int[] arr1 = new int[m];
        int arr1Sum = 0;
        System.out.print("(Matrix 1)Input element :");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = key.nextInt();
            arr1Sum += arr1[i];
        }
        System.out.print("(Matrix 2)Input length :");
        int n = key.nextInt();
        int[] arr2 = new int[n];
        int arr2Sum = 0;
        System.out.print("(Matrix 2)Input element :");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = key.nextInt();
            arr2Sum += arr2[i];
        }
        key.close();
        int totalSum = arr1Sum + arr2Sum;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    totalSum -= arr2[j];
                }
            }
        }
        System.out.println("~~~~~~~");
        System.out.println(totalSum);
    }
}