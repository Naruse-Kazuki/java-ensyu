class Train{
    String name;
    String dest;
    int capacity;
    void setName(String tmpName){
        name = tmpName;
    }
    void setDest(String tmpDest){
        dest = tmpDest;
    }
    void setCapacity(int tmpCapacity){
        capacity = tmpCapacity;
    }
    void display(){
        System.out.println("LineName    :" + name);
        System.out.println("Destination :" + dest);
        System.out.println("Capacity    :" + capacity);
    }
}
class TestTrain{
    public static void main(String[] args){
        Train tr = new Train();
        tr.setName("Chuo Line");
        tr.setDest("Tokyo");
        tr.setCapacity(2000);
        tr.display();
    }
}