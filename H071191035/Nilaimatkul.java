import java.util.Scanner;

class Nilaimatkul {
    
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        double absen, kehadiran, tugas, kuis, mid, fin, total;
        boolean praktikum = false;

        System.out.print("Berapa Jumlah Kehadiran : ");
        absen = sc.nextDouble();

        kehadiran = absen/16*100;
        //Pertama : Mengecek Apakah Kehadiran Memenuhi Syarat
        //Jika Kehadiran Memenuhi Syarat Maka Akan Mengeksekusi Perintah if Berikut
        if (kehadiran >= 80) {
        System.out.println(kehadiran + "%" + " Anda Berhak Ikut Final");

        //Kedua : Mengecek Apakah Mengikuti Praktikum
        System.out.print("Apakah Ikut Praktikum : ");
        praktikum = sc.nextBoolean();

            //Jika Praktikum Bernilai True Maka Akan Mengeksekusi Perintah if Berikut
            if (praktikum == true) {
            System.out.println("Anda Berhak Ikut Final");
            
            System.out.print("Berapa Nilai Tugas : ");
            tugas = sc.nextDouble();

            System.out.print("Berapa Nilai Kuis : ");
            kuis = sc.nextDouble();

            System.out.print("Berapa Nilai Mid Test : ");
            mid = sc.nextDouble();

            System.out.print("Berapa Nilai Final Test : ");
            fin = sc.nextDouble();

                //Ketiga : Mengecek Apakah Nilai Total Memenuhi Syarat Untuk Lulus     
                //Jika Nilai Total Memenuhi Syarat Maka Akan Mengeksekusi Perintah if Berikut
                total = (tugas*0.2) + (kuis*0.25) + (mid*0.25) + (fin*0.30);
                 if (total >= 75) {
                 System.out.println("");
                 System.out.println("Informasi Nilai Mata Kuliah : ");
                 System.out.println("Nilai Tugas : " + tugas);
                 System.out.println("Nilai Kuis : " + kuis);
                 System.out.println("Nilai Mid Test : " + mid);
                 System.out.println("Nilai Final Test : " + fin);
                 System.out.println("Total Nilai " + total + ", Anda Lulus Mata Kuliah Ini");
                 }
                //Jika Nilai Total Tidak Memenuhi Syarat Makan Akan Mengeksekusi Perintah else Berikut
                 else {
                 System.out.println("");
                 System.out.println("Informasi Nilai Mata Kuliah : ");    
                 System.out.println("Nilai Tugas : " + tugas);
                 System.out.println("Nilai Kuis : " + kuis);
                 System.out.println("Nilai Mid Test : " + mid);
                 System.out.println("Nilai Final Test : " + fin);
                 System.out.println("Total Nilai " + total + ", Anda Tidak Lulus Mata Kuliah Ini\nSelamat Mengulang Tahun Depan");
                 }
            }
            //Jika Praktikum Bernilai False Maka Akan Mengeksekusi Perintah else if Berikut
            else if (praktikum == false) {
                System.out.println("Anda Tidak Berhak Ikut Final\nSelamat Mengulang Tahun Depan");
                }
            }
        //Jika Kehadiran Tidak Memenuhi Syarat Maka Akan Mengeksekusi Perintah else Berikut
        else {
            System.out.println(kehadiran + "%" + " Anda Tidak Berhak Ikut Final\nSelamat Mengulang Tahun Depan");
        }
    }
}