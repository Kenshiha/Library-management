public class Books {
    int Bid;
    String Name;
    String Author;
    int Price;

        Books(int Bid, String Name, String Author, int Price){
            this.Bid = Bid;
            this.Name = Name;
            this.Author = Author;
            this.Price = Price;
        }

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

}
