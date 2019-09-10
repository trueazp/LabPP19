import java.util.Scanner;

class TugasPraktikum2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int detik, menit, jam;
        
        System.out.print("Masukkan detik : ");
        detik = in.nextInt();

        jam = detik/3600; detik = detik % 3600;
        menit = detik/60; detik = detik % 60;

        System.out.print("Hasil konversi : " + jam + " : " + menit + " : " + detik);
    }
}
