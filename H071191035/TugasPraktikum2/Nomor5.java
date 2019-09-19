import java.util.Scanner;

class Nomor5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1. vertebrado\n2. invertebrado");
        System.out.print("\nMasukkan nama pertama : ");
        String name1 = in.nextLine();

        if (name1=="vertebrado") {
            System.out.print("1. ave\n2. mamifero");
            System.out.print("\nMasukkan nama kedua : ");
            String name2 = in.nextLine();
            if (name2=="ave") {
                System.out.print("1. carnivoro\n2. onivoro ");
                System.out.print("\nMasukkan nama ketiga : ");
                String name3 = in.nextLine();
                if (name3=="carnivoro") {
                    System.out.println("aguia");
                } else if (name3=="onivoro") {
                    System.out.println("pomba");
                }
            } else if (name2=="mamifero") {
                System.out.print("1. onivoro\n2. herbivoro");
                System.out.print("\nMasukkan nama ketiga : ");
                String name3 = in.nextLine();
                if (name3=="onivoro") {
                    System.out.println("homem");
                } else if (name3=="herbivoro") {
                    System.out.println("vaca");
                }
            }
        } else if (name1=="invertebrado") {
            System.out.print("1. inseto\n2. anelideo");
            System.out.print("\nMasukkan nama kedua : ");
            String name2 = in.nextLine();
            if (name2=="inseto") {
                System.out.print("1. hematofago\n2. herbivoro");
                System.out.print("\nMasukkan nama ketiga : ");
                String name3 = in.nextLine();
                if (name3=="hematofago") {
                    System.out.println("pulga");
                } else if (name3=="herbivoro") {
                    System.out.println("lagarta");
                }
            } else if (name2=="anelideo") {
                System.out.print("1. hematofago\n2. onivoro");
                System.out.print("\nMasukkan nama ketiga : ");
                String name3 = in.nextLine();
                if (name3=="hematofago") {
                    System.out.println("sanguessuga");
                } else if (name3=="onivoro") {
                    System.out.println("minhoca");
                }
            }
        }
    }
}