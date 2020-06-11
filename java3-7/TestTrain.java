class Train{
    private String name;
    private String dest;
    private int capacity;
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
class TestTrain{
    public static void main(String[] args){
        Train tr = new Train("Chuo Line","Tokyo",2000);
        tr.display();
    }
}