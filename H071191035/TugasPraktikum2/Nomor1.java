import java.util.Scanner;

class Nomor1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Input x and y : ");
        int x = key.nextInt(); int y = key.nextInt();

        if (x<0 && y>0 && x+y<0) {
            System.out.print("Titik {" + x + "," + y +"} berada di kuadran 1");
        } else if (x<0 && y>0 && x+y>0) {
            System.out.print("Titik {" + x + "," + y +"} berada di kuadran 2");
        } else if (x<0 && y>0 && x+y==0) {
            System.out.print("Titik {" + x + "," + y +"} berada di garis -x = y");
        } else if (x>0 && y>0 && x<y) {
            System.out.print("Titik {" + x + "," + y +"} berada di kuadran 3");
        } else if (x>0 && y>0 && x>y) {
            System.out.print("Titik {" + x + "," + y +"} berada di kuadran 4");
        } else if (x>0 && y>0 && x==y) {
            System.out.print("Titik {" + x + "," + y +"} berada di garis x = y");
        } else if (x>0 && y<0 && x+y>0) {
            System.out.print("Titik {" + x + "," + y +"} berada di kuadran 5");
        } else if (x>0 && y<0 && x+y<0) {
            System.out.print("Titik {" + x + "," + y +"} berada di kuadran 6");
        } else if (x>0 && y<0 && x+y==0) {
            System.out.print("Titik {" + x + "," + y +"} berada di garis x = -y ");
        } else if (x<0 && y<0 && x>y) {
            System.out.print("Titik {" + x + "," + y +"} berada di kuadran 7");
        } else if (x<0 && y<0 && x>y) {
            System.out.print("Titik {" + x + "," + y +"} berada di kuadran 8");
        } else if (x<0 && y<0 && x==y) {
            System.out.print("Titik {" + x + "," + y +"} berada di garis -x = -y");
        } else if (x==0 && y>0 || y<0) {
            System.out.print("Titik {" + x + "," + y +"} berada di garis y");
        } else if (x>0 || x<0 && y==0) {
            System.out.print("Titik {" + x + "," + y +"} berada di garis x");
        } else {
            System.out.print("Titik {" + x + "," + y +"} berada di titik pusat");
        } key.close();
    }
}