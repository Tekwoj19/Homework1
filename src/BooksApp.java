import java.util.Scanner;

public class BooksApp {



    public static void main(String[] args) {

        //Books LearnJava = new Books("Adam Nowak", "Motocykle", "W oparciu o 170 archiwalnych fotografii przedstawiamy historię 75 marek motocykli Wojska Polskiego z lat 1918 – 1950", "100");

        //System.out.println(LearnJava);

        String author;
        String title;
        String bookDescription;
        String numberofpages;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book author:");
        author = scanner.nextLine();
        System.out.println("Enter book title:");
        title = scanner.nextLine();
        System.out.println("Enter book description:");
        bookDescription = (scanner.nextLine());
        System.out.println("Enter number of pages:");
        numberofpages = (scanner.nextLine());

        Books ksiazka = new Books(author,title,bookDescription,numberofpages);
        System.out.println(ksiazka);



    }


}


