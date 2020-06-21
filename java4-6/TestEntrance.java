abstract interface Entrance {
  public abstract void checkTicket();
}

class Stadium implements Entrance {
  public void checkTicket() {
    System.out.println("スタジアムの入場券を確認します");
  }
}

class Museum implements Entrance {
  public void checkTicket() {
    System.out.println("美術館の入場券を確認します。");
  }
}

class Aquarium implements Entrance {
  public void checkTicket() {
    System.out.println("水族館の入場券を確認します。");
  }
}

class TestEntrance {
  public static void main(String[] args) {
    Entrance[] entrances = { new Stadium(), new Museum(), new Aquarium() };
    for (Entrance obj : entrances) {
      obj.checkTicket();
    }
  }
}