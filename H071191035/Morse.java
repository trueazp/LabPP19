import java.util.HashMap;
import java.util.Scanner;

class Morse {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        HashMap <String, Character> morse = new HashMap<>();

        morse.put(".-", 'A');
        morse.put("-...", 'B');
        morse.put("-.-.", 'C');
        morse.put("-..", 'D');
        morse.put(".", 'E');
        morse.put("..-.", 'F');
        morse.put("--.", 'G');
        morse.put("....", 'H');
        morse.put("..", 'I');
        morse.put(".---", 'J');
        morse.put("-.-", 'K');
        morse.put(".-..", 'L');
        morse.put("--", 'M');
        morse.put("-.", 'N');
        morse.put("---", 'O');
        morse.put(".--.", 'P');
        morse.put("--.-", 'Q');
        morse.put(".-.", 'R');
        morse.put("...", 'S');
        morse.put("-", 'T');
        morse.put("..-", 'U');
        morse.put("...-", 'V');
        morse.put(".--", 'W');
        morse.put("-..-", 'X');
        morse.put("-.--", 'Y');
        morse.put("--..", 'Z');
        morse.put(".----", '1');
        morse.put("..---", '2');
        morse.put("...--", '3');
        morse.put("....-", '4');
        morse.put(".....", '5');
        morse.put("-....", '6');
        morse.put("--...", '7');
        morse.put("---..", '8');
        morse.put("----.", '9');
        morse.put("-----", '0');    
        
        System.out.print("Morses : ");
        String newMorses = key.nextLine();
        String split1[] = newMorses.split(" ");
        
        System.out.print("Meaning : ");
        for (String str : split1) {
            System.out.print(morse.get(str));
        }
        key.close();
    }
}