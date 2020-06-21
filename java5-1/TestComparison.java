import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.*;

class TestComparison {
  // static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String[] str = new String[2];
    try {
      System.out.print("文字列1 : ");
      str[0] = buf.readLine();
      System.out.print("文字列2 : ");
      str[1] = buf.readLine();

    } catch (Exception e) {
    }
    if ("".equals(str[0]) || "".equals(str[1])) {
      System.out.println("文字列を2つ入力してください");
      System.exit(1);
    } else {
      if (str[0].equals(str[1])) {
        System.out.println("等しい");
      } else {
        System.out.println("等しくない");
      }
    }
  }
}