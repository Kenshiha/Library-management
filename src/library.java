import java.util.ArrayList;

public class library {

    ArrayList<Books> book = new ArrayList<>();

    public void addBook(int bid, String name, String Aname, int price){

        Books B = new Books(bid, name, Aname, price);
        book.add(B);
    }
    public void removeBook(int bid){
        for(int i = 0; i < book.size(); i++){
            if(book.get(i).getId() == bid){
                removeBook(i);
                break;
            }
        }
    }
    public Books search(int bid){
        for(Books b : book){
            if(b.getId() == bid){
                return b;
            }
        }
        return null;
    }
    public void update(int bid){

        for(Books b : book){
            if(b.getId() == bid){

            }
        }

    }
    
}
