abstract interface Player {
  public abstract void on();

  public abstract void off();

  public abstract void play();

  public abstract void stop();
}

class CDPlayer implements Player {
  private int sw;
  private String cdTitle;

  public CDPlayer(String cdTitle) {
    this.cdTitle = cdTitle;
  }

  public void on() {
    System.out.println("CDプレイヤーの電源ON");
  }

  public void off() {
    System.out.println("CDプレイヤの電源OFF");
  }

  public void play() {
    System.out.println("CD" + this.cdTitle + "を再生します");
  }

  public void stop() {
    System.out.println("CD" + this.cdTitle + "を停止します");
  }
}

public class TestCDPlayer {
  public static void main(String[] args) {
    Player play = new CDPlayer("ラ・カンパネラ");
    play.on();
    play.play();
    play.stop();
    play.off();
  }
}