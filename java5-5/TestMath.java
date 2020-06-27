class TestMath {
  public static void main(String[] args) {
    int num = (int) (Math.random() * 2);
    if (num == 1) {
      System.out.println("裏");
    } else {
      System.out.println("表");
    }
  }
}