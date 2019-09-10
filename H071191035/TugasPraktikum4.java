import java.util.Scanner;

class TugasPraktikum4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int uang, seratus, lima, dua, sepuluh, limarb, duarb, seribu;

        System.out.print("Masukkan jumlah uang : ");
        uang = in.nextInt();

        //berapa lembar uang Rp 100.000
        seratus = uang/100000; uang = uang % 100000;
        //berapa lembar uang Rp 50.000
        lima = uang/50000; uang = uang % 50000;
        //berapa lembar uang Rp 20.000
        dua = uang/20000; uang = uang % 20000;
        //berapa lembar uang Rp 10.000
        sepuluh = uang/10000; uang = uang % 10000;
        //berapa lembar uang Rp 5.000
        limarb = uang/5000; uang = uang % 5000;
        //berapa lembar uang Rp 2.000
        duarb = uang/2000; uang = uang % 2000;
        //berapa lembar uang Rp 1.000
        seribu = uang/1000;

        System.out.println("Jumlah uang Rp 100.000 : " + seratus);
        System.out.println("Jumlah uang Rp 50.000 : " + lima);
        System.out.println("Jumlah uang Rp 20.000 : " + dua);
        System.out.println("Jumlah uang Rp 10.000 : " + sepuluh);
        System.out.println("Jumlah uang Rp 5.000 : " + limarb);
        System.out.println("Jumlah uang Rp 2.000 : " + duarb);
        System.out.println("Jumlah uang Rp 1.000 : " + seribu);
    }
}
