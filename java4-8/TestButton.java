abstract class Button {
  private String label;

  public Button(String label) {
    this.label = label;
  }

  public String getLabel() {
    return this.label;
  }

  public abstract void press();
}

class StartButton extends Button {
  public StartButton(String label) {
    super(label);
  }

  public void press() {
    System.out.println("処理を開始しました。");
  }
}

class StopButton extends Button {
  public StopButton(String label) {
    super(label);
  }

  public void press() {
    System.out.println("停止しました。");
  }
}

class EjectButton extends Button {
  public EjectButton(String label) {
    super(label);
  }

  public void press() {
    System.out.println("取り出します。");
  }
}

class TestButton {
  public static void main(String[] args) {
    Button[] btn = { new StartButton("再生"), new StopButton("停止"), new EjectButton("取り出し") };
    for (Button obj : btn) {
      System.out.println(obj.getLabel() + "ボタンを押しました。");
      obj.press();
    }
  }
}