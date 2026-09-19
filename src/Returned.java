public class Returned {
    int memberId;
    int bookId;
    int quantity;

    Returned(int memberId, int bookId, int quantity){
        this.memberId = memberId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Member ID:" + memberId +
                "Book ID:" + bookId +
                "Quantity:" + quantity;

    }
}
