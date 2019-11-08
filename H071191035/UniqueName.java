import java.util.Scanner;

class UniqueName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Input your word : ");
        String word1 = key.nextLine();

        String word2 = word1.replaceAll(" ", "");
        String hexa = String.format("%x", word1.length()*word1.length());
        String oct = String.format("%o", word1.length());
        String reverse = ""; 
        char letter[] = word2.toCharArray();
            
        for (int i = 0; i < (word2.length() / 2) - 1; i++) {
            reverse += letter[i];
            }

        for (int i = (word2.length() / 2) - 1; i >= 0; i--) {
            reverse += letter[i];
        }

        System.out.print("Result : ");
        System.out.print("#" + hexa);
        System.out.print(reverse.toUpperCase());
        System.out.print(oct);

        if (hexa.charAt(0) >= '0' && hexa.charAt(0) <= '9') {
            System.out.print("!");
        } else {
            System.out.print("?");
        }
        key.close();
    }
}