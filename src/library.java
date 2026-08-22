import java.util.ArrayList;

public class library {

    ArrayList<Books> book = new ArrayList<>();

    public void Addbook(int bid, String name, String Aname, int price){

        Books B = new Books(bid, name, Aname, price);
        book.add(B);
    }
}
