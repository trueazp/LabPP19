import java.util.Scanner;

class Nomor3 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int odd = 0, even = 0, pos = 0, neg = 0;
        System.out.println("Input 5 number : ");
        int a = obj.nextInt(); int b = obj.nextInt(); int c = obj.nextInt(); int d = obj.nextInt(); int e = obj.nextInt();
        int num1 = a%2 != 0 ? odd++ : even++; int value1 = a>0 ? pos++ : neg++;
        int num2 = b%2 != 0 ? odd++ : even++; int value2 = b>0 ? pos++ : neg++;
        int num3 = c%2 != 0 ? odd++ : even++; int value3 = c>0 ? pos++ : neg++;
        int num4 = d%2 != 0 ? odd++ : even++; int value4 = d>0 ? pos++ : neg++;
        int num5 = e%2 != 0 ? odd++ : even++; int value5 = e>0 ? pos++ : neg++;
        obj.close();
        System.out.printf("Bilangan ganjil : %d", odd);
        System.out.printf("\nBilangan genap : %d", even);
        System.out.printf("\nBilangan positif : %d", pos);
        System.out.printf("\nBilangan negatif : %d", neg);
    }
}