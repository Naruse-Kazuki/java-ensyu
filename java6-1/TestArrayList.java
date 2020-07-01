import java.util.*;

class TestArrayList {
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<>();
    a.add("りんご");
    a.add("みかん");
    a.add("メロン");
    a.add("りんご");
    for (String i : a) {
      System.out.println(i);
    }
  }
}