import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Menu");
            System.out.println("Add Book = 1");
            System.out.println("Remove Book = 2");
            System.out.println("Update Book = 3");
            System.out.println("Search Book = 4");
            System.out.println("Exit = 9");

            library library = new library();

            library.addBook(1,"Harry", "J.J", 9999);
            library.addBook(2,"GOT", "M.M", 9999);
            library.addBook(3,"Jones", "David", 9999);
            library.addBook(4,"Dune", "Martin", 9999);
            library.updateBook(2,6, "Track", "Luthor", 9888);

            Books b = library.search(6);
            System.out.println(b);
    }
}