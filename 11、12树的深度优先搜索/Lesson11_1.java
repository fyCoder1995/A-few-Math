import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.Map.Entry;

public class Lesson11_1 {
  /**
   * @Description: 前缀树的结点
   */
  public class TreeNode {
    public char label; // 结点的名称，在前缀树里是单个字母
    public HashMap<Character, TreeNode> sons = null; // 使用哈希映射存放子节点。哈希便于确认是否已经添加过某个字母对应的节点。
    public String prefix = null; // 从树的根到当前结点这条通路上，全部字母所组成的前缀。例如通路b->o->y,对于字母o结点而言，前缀是b;对于字母y结点而言，前缀是bo。
    public String explanation = null; // 词条的解释

    public String str = null; // 未处理字符串
    // public HashMap<Character, TreeNode> parent = null; // 父结点

    // 初始化结点
    public TreeNode(char l, String pre, String exp) {
      label = l;
      prefix = pre;
      explanation = exp;
      sons = new HashMap<>();

      // // 处理当前字符串的第一个字母
      // char c = str.toCharArray()[0];
      // TreeNode found = null;

      // // 如果字母结点已经存在于当前结点（父结点）的子节点之下，找出它。否则就新生成一个
      // if (parent.sons.containsKey(c)) {
      //   found = parent.sons.get(c);
      // } else {
      //   TreeNode son = new TreeNode(c, pre, "");
      //   parent.sons.put(c, son);
      //   found = son;
      // }
    }

    // 使用栈来实现深度优先搜索
    public void dfsByStack(TreeNode root){
      Stack<TreeNode> stack = new Stack<TreeNode>();
      //创建堆栈对象，其中每个元素都是TreeNode类型
      stack.push(root); // 初始化的时候，压入根结点

      while(!stack.isEmpty()){ // 只要栈里还有结点，就继续下去
        TreeNode node = stack.pop(); // 弹出栈顶的结点

        if(node.sons.size() == 0){
          // 已经到达叶子结点了，输出
          System.out.println(node.prefix + node.label);
        }else{
          // 非叶子结点，遍历它的每个字结点
          Iterator<Entry<Character, TreeNode>> iter = node.sons.entrySet().iterator();

          // 注意，这里使用了一个临时的栈stackTemp
          // 这样做是为了保持遍历的顺序，和递归比遍历的顺序是一致的
          // 如果不要求一致，可以直接压入stack
          Stack<TreeNode> stackTemp = new Stack<TreeNode>();
          while(iter.hasNext()){
            stackTemp.push(iter.next().getValue());
          }
          while(!stackTemp.isEmpty()){
            stack.push(stackTemp.pop());
          }
        }
      }
    }
  }
}
