import java.util.Scanner;

class Nomor1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Input starting value : ");
        int start = obj.nextInt();
        System.out.print("Input end value : ");
        int end = obj.nextInt();
        System.out.println();
        if (start < end) {
            while (start <= end) {
                if (start == 0) {
                    System.out.println(start + " nol");
                    start++;
                } else if (start % 2 != 0) {
                    System.out.println("Bilangan ganjil : " + start);
                    start++;
                } else if (start % 2 == 0) {
                    System.out.println("Bilangan genap : " + start);
                    start++;
                }
            }
            obj.close();
        } else if (start > end) {
            while (end <= start) {
                if (end == 0) {
                    System.out.println(end + " nol");
                    end++;
                } else if (end % 2 != 0) {
                    System.out.println("Bilangan ganjil : " + end);
                    end++;
                } else if (end % 2 == 0) {
                    System.out.println("Biangan genap : " + end);
                    end++;
                }
            }
        }
    }
}