class Goods{
    String name;
    int price;
    String gerName(){
        return name;
    }
    void setName(String tmpName){
        name = tmpName;
    }
    int getPrice(){
        return price;
    }
    void setPrice(int tmpPrice){
        price = tmpPrice;
    }
    void display(){
        System.out.println("商品名 : " + name);
        System.out.println("価  格 : " + price);
    }
}
class TestGoods{
    public static void main(String args[]){
        Goods gs = new Goods();
        gs.setName("りんご");
        gs.setPrice(150);
        gs.display();
        System.out.println();
        gs.setName("みかん");
        gs.setPrice(500);
        gs.display();
    }
}