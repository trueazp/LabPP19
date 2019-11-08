import java.util.Scanner;

class Palyndrome {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int n = key.nextInt();
        String words[] = new String[n];

        for (int i = 0; i < words.length; i++) {
            words[i] = key.next();
        }
        key.close();
        System.out.println("Palyndromes found : " + palyndromes(words));
    }

    static int palyndromes (String[] palyndrome) {
        String reverse = "";
        int count = 0;

        for (int i = 0; i < palyndrome.length; i++) {
            char word[] = palyndrome[i].toCharArray();
            
            for (int j = word.length - 1; j >= 0; j--) {
                reverse += word[j];
            }

            if (palyndrome[i].equals(reverse)) {
                count++;
            }
            reverse = "";
        }

        if (count == 0) {
            System.out.print("No palyndromes found");
        }
        return count;
    }
}