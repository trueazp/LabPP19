import java.util.HashMap;
import java.util.Scanner;

class Movies {
    public static void main(String[] args) {
        Scanner delta = new Scanner(System.in);

        HashMap <Integer, String> movie = new HashMap<>();

        movie.put(1, "1. Avengers - Endgame");
        movie.put(2, "2. Spiderman - Far From Home");
        movie.put(3, "3. Venom");
        movie.put(4, "4. Thor - Ragnarok");

        System.out.println("---\nFavorite Movies");
        for (int i = 1; i <= movie.size(); i++) {
            System.out.println(movie.get(i));
        }
        System.out.print("(d)Detail (s)Search (a)Add (r)Remove\n> ");

        String action = delta.nextLine();

        // details
        if (action.equals("d 1")) {
            System.out.println("---\n> d 1");
            System.out.println("Judul     : Avengers : Endgame");
            System.out.println("Rilis     : 24 April 2019");
            System.out.println("Durasi    : 3 jam 1 menit");
            System.out.println("Genre     : Adventure, Sci-Fi, Action");
            System.out.println("Sinopsis  : Infinity War is better");
            System.out.println("Cast      : RDJ, Chris Evans, Mark Ruffalo");
        } else if (action.equals("d 2")) {
            System.out.println("---\n> d 2");
            System.out.println("Judul     : Spiderman : Far From Home");
            System.out.println("Rilis     : ");
            System.out.println("Durasi    : ");
            System.out.println("Genre     : ");
            System.out.println("Sinopsis  : Multiverse introduced");
            System.out.println("Cast      : Tom Holland");
        } else if (action.equals("d 3")) {
            System.out.println("---\n> d 3");
            System.out.println("Judul     : Venom");
            System.out.println("Rilis     : ");
            System.out.println("Durasi    : ");
            System.out.println("Genre     : Comedy");
            System.out.println("Sinopsis  : It sucks don't watch the movie");
            System.out.println("Cast      : ");
        } else if (action.equals("d 4")) {
            System.out.println("---\n> d 4");
            System.out.println("Judul     : Thor : Ragnarok");
            System.out.println("Rilis     : ");
            System.out.println("Durasi    : ");
            System.out.println("Genre     : ");
            System.out.println("Sinopsis  : Tilted frames are gone");
            System.out.println("Cast      : Chris Hemsworth");
        }

        // Add
        else if (action.equals("a")) {
            System.out.println("Masukkan detail film...");
            System.out.print("Judul     : ");
            String title = delta.nextLine();
            // System.out.print("Rilis     : ");
            // String out = delta.nextLine();
            // System.out.print("Durasi    : ");
            // String duration = delta.nextLine();
            // System.out.print("Genre     : ");
            // String genre = delta.nextLine();
            // System.out.print("Sinopsis  : ");
            // String synopsys = delta.nextLine();
            // System.out.println("Cast      : ");
            // String cast = delta.nextLine();
            movie.put(5, "5. " + title);

            System.out.println("Aftermarth");
        for (int i = 0; i <= movie.size(); i++) {
            System.out.println(movie.get(i));
            } 
        }

        else if (action.equals("s")) {

            System.out.print("Search for movie : ");
            String search = delta.nextLine();

            for (int i = 1; i <= movie.size(); i++) {
                if (movie.get(i).contains(search)) {
                    System.out.println(movie.get(i));
                }
            }
        }

        else if (action.equals("r")) {
            System.out.print("Input movie's key that you want to remove : ");
            int remove = delta.nextInt();
            movie.remove(remove);

            System.out.println("Aftermath");
            for (int i = 0; i <= movie.size(); i++) {
                System.out.println(movie.get(i));
                } 
            }
            delta.close();
        }
    }