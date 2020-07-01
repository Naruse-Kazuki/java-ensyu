import java.io.*;

public class TestDivision {
  public static void main(String[] args) {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    int data1 = 0;
    int data2 = 0;

    try {
      data1 = Integer.parseInt(buf.readLine());
      data2 = Integer.parseInt(buf.readLine());

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("コマンドライン引数が足りません");
      System.out.println(e);
    } catch (ArithmeticException e) {
      System.out.println("割る数が0です。");
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("引数以外が指定されました。");
      System.out.println(e);
    } catch (IOException e) {

    }
    int result = data1 / data2;

    System.out.println(data1 + "/" + data2 + "=" + result);
  }
}