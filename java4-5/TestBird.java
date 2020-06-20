abstract class Bird {
  public abstract void printName();

  public abstract void printAbility();
}

class Penguin extends Bird {
  public void printName() {
    System.out.println("I am a penguin.");
  }

  public void printAbility() {
    System.out.println("I can swim.");
  }
}

class Bats extends Bird {
  public void printName() {
    System.out.println("i am a bats.");
  }

  public void printAbility() {
    System.out.println("I can emit ultrasound.");
  }
}

class TestBird {
  public static void main(String[] args) {
    // Penguin pen = new Penguin();
    // Bats ba = new Bats();
    Bird[] bird = new Bird[2];
    Penguin pen = new Penguin();
    Bats ba = new Bats();
    bird[0] = pen;
    bird[1] = ba;
    bird[0].printName();
    bird[0].printAbility();
    System.out.println();
    bird[1].printName();
    bird[1].printAbility();
  }
}