import java.util.ArrayList;

public class library {

    ArrayList<Books> book = new ArrayList<>();
    ArrayList<Member> member = new ArrayList<>();

    public void addBook(int bid, String name, String Aname, int price, int quantity){

        Books B = new Books(bid, name, Aname, price, quantity);
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
                System.out.println(b);
                return b;
            }
        }
        return null;
    }
    public void updateBook(int existingId, Integer newId, String name, String authorName, Integer price, Integer quantity){

        for(Books b : book){
            if(b.getId() == existingId){

                if(newId != null){
                    b.setId(newId);

                }
                if(name != null){
                    b.setName(name);
                }
                if(authorName != null){
                    b.setAuthor(authorName);
                }
                if(price != null){
                    b.setPrice(price);
                }
                if(quantity != null){
                    b.setQuantity(quantity);
                }
            }
        }

    }

    void addMember(int id, String name){
        Member m = new Member(id,name);
        member.add(m);
    }
    
}
