import java.util.ArrayList;
import java.util.Scanner;

public class library {

    Scanner sc = new Scanner(System.in);
    ArrayList<Books> book = new ArrayList<>();
    ArrayList<Member> member = new ArrayList<>();
    ArrayList<Borrow> borrow = new ArrayList<>();
    ArrayList<Returned> rtn = new ArrayList<>();
    // Books
    public void addBook(int bid, String name, String Aname, int price, int quantity){

        Books B = new Books(bid, name, Aname, price, quantity);
        book.add(B);
    }
    public void removeBook(int bid){
        for(int i = 0; i < book.size(); i++){
            if(book.get(i).getId() == bid){
                book.remove(i);
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
                    b.setTotal(quantity);
                }
            }
        }

    }
//     Members
    void addMember(int id, String name){
        Member m = new Member(id,name);
        member.add(m);
    }
    void removeMember(int id){
        for(int i = 0; i < member.size(); i++){
            if(member.get(i).getId() == id){
                member.remove(i);
                break;
            }
        }
    }
//Borrowing Books
    void borrow(int mid, int bid, int qty){
        Borrow b = new Borrow(mid, bid, qty);

        for(Books book : book){
            if(book.getId() == bid){

                int totalBook = book.getQuantity();
                if(totalBook <= 0){
                    System.out.println( book.Name + "is currently out of stock!");
                    return;
                }

                if(totalBook < qty){
                    System.out.println("Not Enough Books");
                    return;
                }

                book.setQuantity(totalBook - qty);
                borrow.add(b);
                return;
            }
        }
        System.out.println("Book Not Found!!");
    }

    void returnBook(int mid){
        for(Borrow b : borrow){
             if(b.memberId == mid){
                 System.out.print("Enter Book ID:");
                 int bookedId = sc.nextInt();

                 if(b.memberId == mid && b.bookId == bookedId ){

                     for(Books books : book){
                         if(books.getId() == bookedId){
                             System.out.print("Enter Quantity:");
                             int qty = sc.nextInt();

                         }
                     }
                 }

                 //rBookId(bookId);
             }
        }

    }
    void removeBorrow(int mid){
        for(int i = 0; i < borrow.size(); i++){
            if(borrow.get(i).getMid() == mid){
                borrow.remove(i);
            }
        }
    }

  // Returning Book
  public void addReturn(int mid, int bid, int qty){
        Returned r = new Returned(mid,bid,qty);
        rtn.add(r);
  }

}
