public class Returned {
    int memberId;
    int bookId;
    int quantity;
    int time;

    Returned(int memberId, int bookId, int quantity){
        this.memberId = memberId;
        this.bookId = bookId;
        this.quantity = quantity;
    }
    public int getMid(){
        return memberId;
    }
    public int getBid(){
        return bookId;
    }

    @Override
    public String toString(){
        return "Member ID:" + memberId +
                "Book ID:" + bookId +
                "Quantity:" + quantity;

    }
}
