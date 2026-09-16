public class Borrow {
    int memberId;
    int bookId;
    int quantity;

    Borrow(int memberId, int bookId, int quantity){
        this.memberId = memberId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Member ID: " + memberId +
                ", Book ID: " + bookId +
                ", Quantity: " + quantity;
    }
}
