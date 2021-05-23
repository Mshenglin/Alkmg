package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 中序遍历
 * @author
 */
public class TheMiddleOrder {
    List<Integer> list=new ArrayList<>();
    public List<Integer>  MiddleOrder(TreeNode root){
        if(root==null){
            return list;
        }
        Stack<TreeNode> stack=new Stack<>();
        while(!stack.isEmpty()||root != null){
            //循环递归到左子树的最大深度
          while (root!=null){
              stack.push(root);
              root=root.left;
          }
          //递归到最深，开始从左节点开始返回
          if(!stack.isEmpty()){
              root=stack.pop();
              list.add(root.val);
              root=root.right;
          }
        }
        return list;
    }

    public static void main(String[] args) {
        /**
         *     3
         *    / \
         *   9  20
         *  /  /  \
         * 10 15   7
         * 10->9->->3->15->20->7
         */
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.left.left=new TreeNode(10);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        TheMiddleOrder preOrder=new TheMiddleOrder();
        List<Integer> list = preOrder.MiddleOrder(root);
        for (Integer i:
                list){
            System.out.print(i+"\t");
        }
    }
}
