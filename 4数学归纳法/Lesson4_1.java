
public class Lesson3_1 {
  // 算算舍罕王给了多少粒麦子
  public static long getNumberOfWheat(int grid) {
    long sum = 0;
    long numberOfWheatInGrid = 0;

    numberOfWheatInGrid = 1;
    sum += numberOfWheatInGrid;

    for (int i = 2; i <= grid; i++) {
      numberOfWheatInGrid *= 2;
      sum += numberOfWheatInGrid;
    }

    return sum;
  }

  public static void main(String[] args) {
    int grid = 63;
    long start, end = 0;
    start = System.currentTimeMillis();
    System.out.println(String.format("舍罕王给了这么多粒：%d", Lesson3_1.getNumberOfWheat(grid)));
    end = System.currentTimeMillis();
    System.out.println("耗时：" + (end - start) + "ms");

    start = System.currentTimeMillis();
    System.out.println(String.format("舍罕王给了这么多粒：%d", (long) (Math.pow(2, grid)) - 1));
    end = System.currentTimeMillis();
    System.out.println("耗时：" + (end - start) + "ms");
  }
}