import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String word = key.nextLine();

        if (word.length() >= 16) {
        char letter[] = word.toCharArray();
        String matrix1 = "";

        for (int i = 0; i < letter.length; i++) {
            if (i % 2 != 0) {
                int charray = (int) letter[i];
                matrix1 += charray;
            } else {
                matrix1 += letter[i];
            }
        }

        char matrix2[] = matrix1.toCharArray();
        int words = (int) Math.ceil(matrix2.length / 16.0);
        int space = 0;

        for (int i = 0; i < words * 16; i++) {
                if (i < matrix2.length)
                    System.out.print(matrix2[i]);
                else
                    System.out.print('?');

            if ((i + 1) % words == 0) {
                if (space >= 3) {
                    System.out.println();
                    space = 0;
                } else {
                    System.out.print(" ");
                    space++;
                    } 
                }
            }
        } else {
            System.out.print("Word's length must be >= 16");
        }
        key.close();
    }
}