public class Member {
    int id;
    String name;
    int no;

    Member(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return "ID: " + id +
                "Name: "+ name;
    }
}
