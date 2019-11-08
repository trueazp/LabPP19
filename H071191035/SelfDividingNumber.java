import java.util.*;

class SelfDividingNumber {
    public static void main(String[] args) {

        //input rentang angka
        Scanner key = new Scanner (System.in);
        System.out.print("Bilangan awal : ");
        int start = key.nextInt();
        System.out.print("Bilangan akhir : ");
        int end = key.nextInt();
        System.out.print("Bilangan yang dapat dibagi dengan digitnya : ");
        ArrayList <Integer> result = new ArrayList<>();

        int startPoint = end > start ? start : end;
        int endPoint = end > start ? end : start;

        // Perulangan untuk mengecek setiap digit
        // apakah digit itu mampu membagi habis bilangan utamanya
        int digits;
        for(int i = startPoint; i <= endPoint; i++) {

            HashMap<Integer, Integer> numbers = new HashMap<>();
            
            int a = i;
            int b = 0;
            while(Math.abs(a) > 0){
                digits = Math.abs(a) % 10;
                a = Math.abs(a) / 10;
                numbers.put(b, digits);
                b++;
            }
            a = i;
            int correctDigits = 0;

            // Mengecek pembagian digit untuk menghitung berapa banyak bilangan yang valid
            for(int k = 0 ;k < numbers.size(); k++) {
                if(numbers.get(k) != 0 && a % Math.abs(numbers.get(k)) == 0){
                    correctDigits++;
                }
            }
            if(correctDigits == b){
                result.add(a);
            }
        }
        // Membalik output jika awal bilangan lebih kecil dari bilangan akhir (Di mulai secara terbalik) 
        if(start > end){
            Collections.reverse(result);
            System.out.print(result);
        }
        else{
            System.out.print(result);
        }
        key.close();
    }
}