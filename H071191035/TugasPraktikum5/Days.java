import java.util.Scanner;

class Days {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        myDay(n);
    }

    public static void myDay (int day) {
        int year = day / 365; 
        day = day % 365;
        int month = day / 30; 
        day = day % 30;
        int days = day;
        System.out.println(year + " tahun");
        System.out.println(month + " bulan");
        System.out.println(days + " hari");
    }
}
