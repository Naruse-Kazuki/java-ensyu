import java.util.*;

class Goods {
  private String name;
  private int price;

  public Goods() {
  }

  public Goods(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void display() {
    System.out.println("商品名：" + name + "  単価：" + price);
  }
}

public class TestGoodsArrayList {
  public static void main(String[] args) {
    Goods a = new Goods("りんご", 150);
    Goods b = new Goods("りんご", 200);
    Goods c = new Goods("みかん", 100);
    Goods d = new Goods("りんご", 150);
    ArrayList<Goods> list = new ArrayList<>();
    list.add(a);
    list.add(b);
    list.add(c);
    list.add(d);
    for (Goods i : list) {
      i.display();
    }
  }
}