class Train{
    String name;
    String dest;
    int capacity;
    Train(String tmpName, String tmpDest, int tmpCapacity){
        name = tmpName;
        dest = tmpDest;
        capacity = tmpCapacity;
    }
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
public class TestTrain{
    public static void main(String[] args){
        Train tr = new Train("Chuo Line","Tokyo",2000);
        tr.display();
    }
}