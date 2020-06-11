class Box{
    private int height = 0;
    private int width = 0;
    private int depth = 0;
    void setSize(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    void print(){
        System.out.println("高さ　 : " + height);
        System.out.println("幅　　 : " + width);
        System.out.println("奥行き : " + depth);
    }
    int getValue(){
        return height*width*depth;
    }
}
class ColorBox extends Box{
    private String color;
    void setColor(String color){
        this.color = color;
    }
    void printColor(){
        System.out.println("色　　 : "+color);
    }
}
public class TestColorBox{
    public static void main(String args[]){
        Box box = new Box();
        ColorBox cb = new ColorBox();
        box.setSize(3,4,5);
        cb.setColor("赤");
        box.print();
        cb.printColor();
    }
}