import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        try {
        System.out.println("Masukkan jam dan menit awal : ");
        int jam1 = sc.nextInt(); int menit1 = sc.nextInt();
        System.out.println("Masukkan jam dan menit akhir : ");
        int jam2 = sc.nextInt(); int menit2 = sc.nextInt();
        int hour; int minute;

            if (jam2 > jam1){
                if (menit2 > menit1){
                hour = jam2 - jam1;
                minute = menit2 - menit1;
                System.out.println(hour + ":" + minute);
                } else {
                hour = jam2 - jam1 - 1;
                minute = 60 - (menit1 - menit2);
                System.out.println("Lama waktu : " + hour + ":" + minute);
             }
            } 
            if (jam1 > jam2){
                if (menit2 > menit1){
                hour = 24 -(jam1 - jam2);
                minute = menit2 - menit1;
                System.out.println("Lama waktu : " + hour + ":" + minute);
                } else {
                hour = 24 - (jam1 - jam2) - 1;
                minute = 60 - (menit1 - menit2);
                System.out.println("Lama waktu : " + hour + ":" + minute);
             } sc.close();
            }
        } catch (Exception ime){
        System.out.println("error");
        } 
    }
}