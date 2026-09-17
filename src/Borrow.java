public class Borrow {
    int memberId;
    int bookId;
    int quantity;

    Borrow(int memberId, int bookId, int quantity){
        this.memberId = memberId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getBid(){
        return bookId;
    }
    public int getMid(){
        return memberId;
    }

    @Override
    public String toString(){
        return "Member ID: " + memberId +
                ", Book ID: " + bookId +
                ", Quantity: " + quantity;
    }
}
