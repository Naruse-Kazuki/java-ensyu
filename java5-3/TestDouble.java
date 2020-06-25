import java.io.*;

class TestDouble {
  public static void main(String[] args) {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String[] num = new String[2];
    double[] n = new double[2];

    try {
      num[0] = buf.readLine();
      num[1] = buf.readLine();
      if (num[0].isEmpty() || num[1].isEmpty()) {
        System.out.println("小数を２つ入力してください");
        System.exit(1);
      } else {
        n[0] = Double.parseDouble(num[0]);
        n[1] = Double.parseDouble(num[1]);
        System.out.println(n[0] + " * " + n[1] + " = " + n[0] * n[1]);
        System.out.println(n[0] + " / " + n[1] + " = " + n[0] / n[1]);
      }
    } catch (IOException e) {
      System.exit(1);
    }
  }
}