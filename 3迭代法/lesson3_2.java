public class lesson3_2 {
  // 计算大于1的正整数之平方根
  // n：待求的数，deltaThreshold：误差的阈值（精度），maxTry：二分查找的最大次数（最大迭代次数）
  public static double getSqureRoot(int n, double deltaThreshold, int maxTry) {
    if (n <= 1) {
      return -1.0;
    }

    double min = 1.0, max = (double) n;
    for (int i = 0; i < maxTry; i++) {
      double middle = (min + max) / 2;
      double square = middle * middle;
      double delta = Math.abs((square / n) - 1);
      if (delta <= deltaThreshold) {
        return middle;
      } else {
        if (square > n) {
          max = middle;
        } else {
          min = middle;
        }
      }
    }
    return -2.0;
  }

  public static void main(String[] args) {
    int number = 2;
    double squareRoot = lesson3_2.getSqureRoot(number, 0.000001, 10000);
    if (squareRoot == -1.0) {
      System.out.println("请输入大于1的整数");
    } else if (squareRoot == -2.0) {
      System.out.println("未能找到解");
    } else {
      System.out.println(String.format("%d的平方根是%f", number, squareRoot));
    }
  }
}