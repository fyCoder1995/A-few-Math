public class Lesson1_3 {
  // 二进制按位“或”的操作
  public static int or(int num1, int num2) {
    return (num1 | num2);
  }

  // 二进制按位“与”的操作
  public static int and(int num1, int num2) {
    return (num1 & num2);
  }

  // 二进制按位“异或”的操作
  public static int xor(int num1, int num2) {
    return (num1 ^ num2);
  }

  public static void main(String[] args) {
    int a = 53;
    int b = 35;

    System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘或’结果是%d(%s)", a, Lesson1_1.decimalToBinary(a), b,
        Lesson1_1.decimalToBinary(b), Lesson1_3.or(a, b), Lesson1_1.decimalToBinary(Lesson1_3.or(a, b))));

    System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘与’结果是%d(%s)", a, Lesson1_1.decimalToBinary(a), b,
        Lesson1_1.decimalToBinary(b), Lesson1_3.and(a, b), Lesson1_1.decimalToBinary(Lesson1_3.and(a, b))));

    System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘异或’结果是%d(%s)", a, Lesson1_1.decimalToBinary(a), a,
        Lesson1_1.decimalToBinary(a), Lesson1_3.xor(a, a), Lesson1_1.decimalToBinary(Lesson1_3.xor(a, a))));

  }
}
