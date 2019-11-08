import java.util.Scanner;

class UniqueCode {

    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);

        System.out.print("Input your word : ");
        String str = key.nextLine();
        char letter[] = str.toCharArray();

        System.out.print("Result : ");
        if (str.length() % 2 == 1) {
            for (int i = str.length() - 1; i >= (str.length() / 2) + 1; i--) {
                String cout = "";
                cout += str.charAt(i);
                System.out.print(cout.toUpperCase());
            }
            for (int i = 0; i < (str.length() / 2) + 1; i++) {
                letter[i] += 3;
                String cout = "";
                cout += letter[i];
                System.out.print(cout.toUpperCase());
            }
        }

        else {
            for (int i = str.length() - 1; i >= str.length() / 2; i--) {
                String cout = "";
                cout += str.charAt(i);
                System.out.print(cout.toUpperCase());
            }
            for (int i = 0; i < (str.length() / 2); i++) {
                letter[i] += 3;
                String cout = "";
                cout += letter[i];
                System.out.print(cout.toUpperCase());
            }
            key.close();
        }
    }
}