class Train {
  private String name;
  private String dest;
  private int capacity;

  public Train() {
    this.name = "未設定";
    this.dest = "未設定";
    this.capacity = 0;
  }

  public Train(String name, String dest, int capacity) {
    this.name = name;
    this.dest = dest;
    this.capacity = capacity;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDest() {
    return dest;
  }

  public void setDest(String dest) {
    this.dest = dest;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void display() {
    System.out.println("LineName    :" + name);
    System.out.println("Destination :" + dest);
    System.out.println("Capacity    :" + capacity);
  }
}

class Express extends Train {
  private int reservedS;
  private int freeS;

  public Express(String name, String dest, int capacity, int reservedS, int freeS) {
    super(name, dest, capacity);
    this.reservedS = reservedS;
    this.freeS = freeS;
  }

  public void setReservedS(int reservedS) {
    this.reservedS = reservedS;
  }

  public void setFreeS(int freeS) {
    this.freeS = freeS;
  }

  @Override
  public void display() {
    System.out.println("LineName    :" + getName());
    System.out.println("Destination :" + getDest());
    System.out.println("Capacity    :" + getCapacity());
    System.out.println("Reserved Seat : " + reservedS);
    System.out.println("Free Seat : " + freeS);
  }
}

public class TestExpress {
  public static void main(String[] args) {
    Express ex = new Express("Narita Express", "Narita", 2000, 1800, 200);
    ex.display();
  }
}