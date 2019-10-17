import java.util.Scanner;

class ZeroIndex {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Input row and column : ");
        int m = key.nextInt();
        int n = key.nextInt();
        int[][] binary = new int [m][n];
        
        System.out.println("Input element : ");
        for (int i = 0; i < binary.length; i++) {
            for (int j = 0; j < binary.length; j++) {
                binary[i][j] = key.nextInt();
            }
        }
        key.close();
         for (int i = 1; i < binary.length - 1; i++) {
             for (int j = 1; j < binary.length - 1; j++) {
                 if (binary[i][j] == 0) {
                     if (binary[i][j] != binary[i][j-1] && binary[i][j] != binary[i][j+1] && binary[i][j] != binary[i-1][j] && binary[i][j] != binary[i+1][j]) {
                         System.out.println("Berada di indeks : " + i + "," + j);
                     }
                 }
             }
         }   
    }
}