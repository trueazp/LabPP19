import java.util.Scanner;

class Nomor5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan sudut : ");
        float sudut = in.nextFloat();
        int detik = Math.round((sudut/360)*(24*3600));
        int jam = 0, menit = 0;

        if (sudut >= 0) {
            while (detik >= 3600) {
                jam++;
                detik -= 3600;
            }
            while (detik >= 60) {
                menit++;
                detik -= 60;
            }
            jam = (jam+6)%24;
            if (jam < 12) {
                System.out.println("Selamat pagi...");
                System.out.printf("%d : %d : %d", jam, menit, detik);
            } else if (jam < 15) {
                System.out.println("Selamat siang...");
                System.out.printf("%d : %d : %d", jam, menit, detik);
            } else if (jam < 18) {
                System.out.println("Selamat sore...");
                System.out.printf("%d : %d : %d", jam, menit, detik);
            } else if (jam < 24) {
                System.out.println("Selamat malam...");
                System.out.printf("%d : %d : %d", jam, menit, detik);
            }
            in.close();
        } else {
            System.out.print("...");
        }
    }
}