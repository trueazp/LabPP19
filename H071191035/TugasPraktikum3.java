import java.util.Scanner;

class TugasPraktikum3 {

        public static void main (String[] args) {
            
            Scanner in = new Scanner(System.in);

            int tinggi, elevasi1, elevasi2;
            double alas1, alas2, sudut1, sudut2;
            double kapal;

            //tinggi menara
            System.out.print("Berapa tinggi menara : ");
            tinggi = in.nextInt();

            //sudut elevasi pengamat terhadap ujung depan kapal
            System.out.println("90 > Elevasi 1  > Elevasi 2");
            System.out.print("Berapa sudut elevasi oleh pengamat terhadap ujung belakang kapal : ");
            elevasi1 = in.nextInt();

            //sudut elevasi pengamat terhadap ujung belakang kapal
            System.out.print("Berapa sudut elevasi oleh pengamat terhadap ujung depan kapal : ");
            elevasi2 = in.nextInt();
            
            sudut1 = Math.tan(Math.toRadians(elevasi1));
            sudut2 = Math.tan(Math.toRadians(elevasi2));
            alas1 = sudut1*tinggi;
            alas2 = sudut2*tinggi;
            kapal = alas1-alas2;

            System.out.printf("Panjang kapal : %.1f m", kapal);
        }
}
