import java.io.*;

class TestSearchString {
  public static void main(String[] args) {
    BufferReader buf = new BufferReader(new InputStreamReader(System.in));
    String[] str = { "red", "ogange", "yellow", "green", "blue" };
    String input = buf.read();
    switch (input) {
      case "red":
        for (int i = 0; i < 5; i++) {
          System.out.println("colors[" + i + "]:" + str[i]);
        }
        System.out.println("redは１番目に見つかりました。");
        break;
      case "orange":

    }
  }
}