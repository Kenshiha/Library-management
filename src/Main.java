import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        library library = new library();

        Scanner sc = new Scanner(System.in);

            System.out.println("Menu");
            System.out.println("Add Book = 1");
            System.out.println("Remove Book = 2");
            System.out.println("Update Book = 3");
            System.out.println("Search Book = 4");
            System.out.println("Exit = 9");

            while (true){
                System.out.print("Chose Operation = ");
                int num = sc.nextInt();

                if(num == 9){
                    System.out.print("Exiting Program..");
                    break;
                }

                if(num == 1){
                    System.out.print("Enter Book ID:");
                    int bid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name:");
                    String bname = sc.nextLine();

                    System.out.print("Enter Author Name:");
                    String aname = sc.nextLine();

                    System.out.print("Enter Price:");
                    int price = sc.nextInt();

                    System.out.println("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    library.addBook(bid,bname,aname,price,quantity);
                    System.out.println("Book Added Succesfully");
                }
                if(num == 2){
                    System.out.print("Enter Book ID:");
                    int bid = sc.nextInt();

                    library.removeBook(bid);
                    System.out.println("Book Removed");
                }
                if(num == 3){
                    System.out.print("Enter Old Book ID:");
                    int oldId = sc.nextInt();
                    System.out.print("Enter New Book ID:");
                    Integer newId = sc.nextInt();
                    System.out.print("Enter Book Name:");
                    String bname = sc.nextLine();
                    System.out.print("Enter Author Name:");
                    String aname = sc.nextLine();
                    System.out.print("Enter Price:");
                    int price = sc.nextInt();

                    library.updateBook(oldId, newId, bname, aname, price);
                    System.out.println("Book Updated");
                }
                if(num == 4){
                    System.out.print("Enter Book ID:");
                    int bid = sc.nextInt();

                    library.search(bid);
                }
            }
//

            sc.close();
    }
}