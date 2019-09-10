import java.util.Scanner;

class TugasPraktikum5 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String nama, kelamin;
        float tinggi, berat, ideal, presentasi;

        System.out.print("Masukkan nama : ");
        nama = in.nextLine();

        System.out.print("Masukkan jenis kelamin : ");
        kelamin = in.nextLine();

        System.out.print("Masukkan tinggi : ");
        tinggi = in.nextFloat();

        System.out.print("Masukkan berat badan : ");
        berat = in.nextFloat();

        System.out.print("Masukkan presentasi berat badan ideal (10% untuk L 15% untuk P) : ");
        presentasi = in.nextFloat();

        ideal = (tinggi-100)-(presentasi/100*berat);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis kelamin : " + kelamin);
        System.out.println("Tinggi badan : " + tinggi +" cm");
        System.out.println("Berat badan : " + berat + " kg");
        System.out.println("Berat badan ideal : " + ideal + " kg");
        System.out.printf("Target berat badan ideal : %.1f kg", ideal-berat);
    }
}