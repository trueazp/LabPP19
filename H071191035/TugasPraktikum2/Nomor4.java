import java.util.Scanner;

class Nomor4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("**MENU**");
        System.out.println("1. Mencari luas bangun datar\n2. Mencari volume bangun ruang");
        System.out.print("Pilih opsi : ");
        int n = in.nextInt();

        if (n == 1) {
            System.out.println("1. Persegi\n2. Persegi panjang\n3. Segitiga\n4. Lingkaran\n5. jajar genjang\n6. Trapesium\n7. Belah ketupat\n8. Layang-layang");
            System.out.print("Pilih bangun datar : ");
            int option = in.nextInt();

            if (option == 1) {
                System.out.println("Masukkan panjang dan lebar : ");
                double panjang = in.nextDouble(); double lebar = in.nextDouble();
                double persegi = panjang * lebar;
                System.out.print("Luas persegi : " + persegi);
            } else if (option == 2) {
                System.out.println("Masukkan panjang dan lebar : ");
                double panjang = in.nextDouble(); double lebar = in.nextDouble();
                double persegiPanjang = panjang * lebar;
                System.out.print("Luas persegi panjang : " + persegiPanjang);
            } else if (option == 3) {
                System.out.println("Masukkan alas dan tinggi : ");
                double alas = in.nextDouble(); double tinggi = in.nextDouble();
                double segitiga = (alas * tinggi) / 2;
                System.out.print("Luas segitiga : " + segitiga);
            } else if (option == 4) {
                System.out.print("Masukkan jari jari : ");
                double r = in.nextDouble();
                double lingkaran = Math.PI * Math.pow(r, 2);
                System.out.printf("Luas lingkaran %.2f: ", lingkaran);
            } else if (option == 5) {
                System.out.println("Masukkan alas dan tinggi : ");
                double alas = in.nextDouble(); double tinggi = in.nextDouble();
                double jajargenjang = alas * tinggi;
                System.out.println("Luas jajargenjang : " + jajargenjang);
            } else if (option == 6) {
                System.out.println("Masukkan sisi sejajar : ");
                double sisiSejajar = in.nextDouble(); double tinggi = in.nextDouble();
                double trapesium = (sisiSejajar * tinggi) / 2;
                System.out.print("Luas trapesium : " + trapesium);
            } else if (option == 7) {
                System.out.println("Masukkan diagonal 1 dan 2 : ");
                double d1 = in.nextDouble(); double d2 = in.nextDouble();
                double ketupat = (d1 * d2) / 2;
                System.out.print("Luas belah ketupat : " + ketupat);
            } else if (option == 8) {
                System.out.println("Masukkan diagonal 1 dan 2: ");
                double d1 = in.nextDouble(); double d2 = in.nextDouble();
                double layang = (d1 * d2) / 2;
                System.out.print("Luas layang-layang : " + layang);
            } else {
                System.out.print("error");
            }
        } else if (n == 2) {
            System.out.println("1. Kubus\n2. Balok\n3. Limas\n4. Prisma\n5. Tabung\n6. Kerucut\n7. Bola");
            System.out.print("Pilih bangun ruang : ");
            int option = in.nextInt();

            if (option == 1) {
                System.out.print("Masukkan panjang sisi : ");
                double sisi = in.nextDouble();
                double cube = Math.pow(sisi, 3);
                System.out.printf("Volume kubus : %.2f", cube);
            } else if (option == 2) {
                System.out.println("Masukkan panjang, lebar, dan tinggi : ");
                double panjang = in.nextDouble(); double lebar = in.nextDouble(); double tinggi = in.nextDouble();
                double beam = panjang * lebar * tinggi;
                System.out.printf("Volume balok : %.2f", beam);
            } else if (option==3) {
                System.out.println("Masukkan luas alas dan tinggi : ");
                double luasAlas = in.nextDouble(); double tinggi = in.nextDouble();
                double pyramid = (luasAlas*tinggi);
                System.out.printf("Volume limas : %.2f", pyramid);
            } else if (option==4) {
                System.out.println("Masukkan luas alas dan tinggi : ");
                double luasAlas = in.nextDouble(); double tinggi = in.nextDouble();
                double prism = (luasAlas*tinggi);
                System.out.printf("Volume prisma : %.2f", prism);
            } else if (option==5) {
                System.out.println("Masukkan jari-jari dan tinggi : ");
                double r = in.nextDouble(); double tinggi = in.nextDouble();
                double tube = Math.PI*Math.pow(r, 2)*tinggi;
                System.out.printf("Volume tabung : %.2f", tube);
            } else if (option==6) {
                System.out.println("Masukkan jari-jari dan tinggi : ");
                double r = in.nextDouble(); double tinggi = in.nextDouble();
                double cone = (Math.PI*Math.pow(r, 2)*tinggi)/3;
                System.out.printf("Volume kerucut : %.2f", cone);
            } else if (option==7) {
                System.out.print("Masukkan jari-jari : ");
                double r = in.nextDouble();
                double ball = (Math.PI*Math.pow(r, 3))*4;
                System.out.printf("Volume bola : %.2f", ball);
            } 
            else {
                System.out.print("error");
            } in.close();
        } 
    }
}