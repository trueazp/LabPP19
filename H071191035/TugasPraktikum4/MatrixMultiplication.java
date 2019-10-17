import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("(Matrix 1)Input row and column : ");
        int m = key.nextInt();
        int n = key.nextInt();
        int[][] arr1 = new int[m][n];

        System.out.println("(Matrix 1)Input element : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = key.nextInt();
            }
        }
        System.out.println("Matrix 1 :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("(Matrix 2)Input row and column : ");
        int x = key.nextInt();
        int y = key.nextInt();
        int[][] arr2 = new int [x][y];

        System.out.println("(Matrix 2)Input element : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr2[i][j] = key.nextInt();
            }
        } key.close();
        System.out.println("Matrix 2 :");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        
        //matrix multiplication;
        int [][] result = new int [m][y];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < y; j++) {
                int z = 0;
                for (int k = 0; k < n; k++) {
                    z = z + arr1[i][k] * arr2[k][j];
                }
                result[i][j] = z;
            }
        }

        System.out.println("~~~~~~~~");
        System.out.println("Multiplication result : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}