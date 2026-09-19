public class Books {
    int Bid;
    String Name;
    String Author;
    int Price;
    int Total;
    int Quantity;

        Books(int Bid, String Name, String Author, int Price, int Quantity){
            this.Bid = Bid;
            this.Name = Name;
            this.Author = Author;
            this.Price = Price;
            this.Quantity = Quantity;
            this.Total = Quantity;
        }
// For Updating Book Details
        public int getId(){
            return Bid;
        }
        public void setId(int newId){
            this.Bid = newId;
        }
        public void setName(String name){
            this.Name = name;
        }
        public void setAuthor(String author){
            this.Author = author ;
        }
        public void setPrice(int price){
            this.Price = price;
        }
        public void setTotal(int total){
            this.Total = total;
        }
        public void setQuantity(int qty){ this.Quantity = qty;}
        public int getQuantity(){
            return Quantity;
        }
        public int getTotal(){
            return Total;
        }

        @Override
        public String toString(){
            return "BID: " + Bid +
                    ", Book Name: " + Name +
                    ", Author Name: " + Author +
                    ", Price: " + Price +
                    ", Total" + Total;

        }

}
