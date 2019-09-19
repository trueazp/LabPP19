import java.util.Scanner;

class TugasPraktikum1 {
    
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int waktu, kecepatan;
        float bensin;

        System.out.print("Berapa waktu yang di butuhkan (dalam jam) : ");
        waktu = in.nextInt();

        System.out.print("Berapa kecepatan rata ratanya (km/jam) : ");
        kecepatan = in.nextInt();

        bensin = waktu*kecepatan/14.0f;
        System.out.printf("Jumlah bensin yang di gunakan : %.1f L", bensin);
    }
}
