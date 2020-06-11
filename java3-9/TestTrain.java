class Train{
    private String name;
    private String dest;
    private int capacity;
    public Train(){
        this.name = "未設定";
        this.dest = "未設定";
        this.capacity = 0;
    }
    public Train(String name, String dest, int capacity){
        this.name = name;
        this.dest = dest;
        this.capacity = capacity;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDest(String dest){
        this.dest = dest;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void display(){
        System.out.println("LineName    :" + name);
        System.out.println("Destination :" + dest);
        System.out.println("Capacity    :" + capacity);
    }
}
public class TestTrain{
    public static void main(String[] args){
        Train tr1 = new Train();
        Train tr2 = new Train("Chuo Line","Tokyo",2000);
        tr1.display();
        System.out.println();
        tr2.display();
    }
}