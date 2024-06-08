import java.util.ArrayList;

public class Lesson5_1 {
  public static long[] rewards = { 1, 2, 5, 10 };// 四种面额的纸币
  public static int count = 0;

  // 使用函数的递归（嵌套）调用，找出所有可能的奖赏组合
  // totalReward：奖赏总金额，result：保存当前的解
  public static void get(long totalReward, ArrayList<Long> result) {
    if (totalReward == 0) {
      count++;
      System.out.println(result);
      System.out.println(count);
      return;
    } else if (totalReward < 0) {
      return;
    } else {
      for (int i = 0; i < rewards.length; i++) {
        ArrayList<Long> newResult = (ArrayList<Long>) (result.clone());
        newResult.add(rewards[i]);
        get(totalReward - rewards[i], newResult);
      }
    }
  }

  // 思考题 输入一个数，找出其所有的因数
  public static void recursion(long total, ArrayList<Long> result) {
    if (total == 1) {
      if (!result.contains(1L))
        result.add(1L);
      System.out.println(result);
      return;
    } else {
      for (long i = 1; i <= total; i++) {
        if ((i == 1) && result.contains(1L))
          continue;
        ArrayList<Long> newList = (ArrayList<Long>) (result.clone());
        newList.add(Long.valueOf(i));
        if (total % i != 0) {
          continue;
        }
        recursion(total / i, newList);
      }
    }
  }

  public static void main(String[] args) {
    int totalReward = 10;
    Lesson5_1.get(totalReward, new ArrayList<Long>());
    System.out.println("--------------");
    long total = 8;
    recursion(total, new ArrayList<Long>());
  }
}