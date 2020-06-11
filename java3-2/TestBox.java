class Box{
    int height = 0;
    int width = 0;
    int depth = 0;
    void setSize(int tmpHeight, int tmpWidth, int tmpDepth){
        height = tmpHeight;
        width = tmpWidth;
        depth = tmpDepth;
    }
    void print(){
        System.out.println("高さ : " + height);
        System.out.println("幅 : " + width);
        System.out.println("奥行き : " + depth);
    }
    int getValue(){
        return height*width*depth;
    }
}

public class TestBox{
    public static void main(String args[]){
        Box box = new Box();
        box.setSize(3,4,5);
        box.print();
        System.out.println("体積..." + box.getValue());
    }
}