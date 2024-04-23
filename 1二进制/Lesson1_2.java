public class Lesson1_2 {
  // 向左移位
  public static int leftShift(int num, int m) {
    return num << m;
  }

  // 向右移位
  public static int rightShift(int num, int m) {
    return num >> m;
  }

  public static void main(String[] args) {
    int num = 53;
    int m = 1;
    System.out.println(String.format("数字%d的二进制向左移%d位是%d", num, m, leftShift(num, m)));
    System.out.println(String.format("数字%d的二进制向右移%d位是%d", num, m, rightShift(num, m)));

    System.out.println("------------------------------------");

    m = 3;

    System.out.println(String.format("数字%d的二进制向左移%d位是%d", num, m, leftShift(num, m)));
    System.out.println(String.format("数字%d的二进制向右移%d位是%d", num, m, rightShift(num, m)));
  }
}