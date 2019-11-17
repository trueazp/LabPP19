import java.util.*;

class Uppercase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String word = key.nextLine();
        char letter[] = word.toCharArray();

        for (int i = 0; i < letter.length; i++) {
            char c = letter[i];
            if (c >= 'a' && c <= 'z') {
                letter[i] -= 32;
            }
        }
        for (int i = 0; i < letter.length; i++) {
            System.out.print(letter[i]);
        }
        key.close();    
    }    
}