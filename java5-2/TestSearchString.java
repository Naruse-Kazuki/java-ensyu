
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestSearchString {
  public static void main(String[] args) {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String[] str = { "red", "ogange", "yellow", "green", "blue" };
    try {
      String input = buf.readLine();
      if (input.isEmpty()) {
        System.out.println("色を１つ入力してください。");
        System.exit(1);
      } else {
        for (int i = 0; i < 5; i++) {
          System.out.println("colors[" + i + "]:" + str[i]);
        }
        switch (input) {
          case "red":
            System.out.println("redは0番目に見つかりました。");
            break;
          case "orange":
            System.out.println("orangeは1番目に見つかりました。");
            break;
          case "yellow":
            System.out.println("yellowは2番目に見つかりました。");
            break;
          case "green":
            System.out.println("greenは3番目に見つかりました。");
            break;
          case "blue":
            System.out.println("blueは4番目に見つかりました。");
            break;
          default:
            System.out.println(input + "は見つかりませんでした。");
            break;
        }
      }
    } catch (Exception e) {
      System.exit(1);
    }
  }
}