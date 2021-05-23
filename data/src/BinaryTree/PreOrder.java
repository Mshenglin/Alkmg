package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 前序
 */
public class PreOrder {
    List<Integer> list=new ArrayList<>();
    public List<Integer>  PreOrderRaversal(TreeNode root){
            if(root==null){
                return list;
            }
        Stack<TreeNode> stack=new Stack<>();
            stack.push(root);
            TreeNode cur=null;
            while(!stack.isEmpty()){
                cur=stack.pop();
                list.add(cur.val);
                if (cur.right != null) {
                    stack.push(cur.right);
                }
                if (cur.left != null) {
                    stack.push(cur.left);
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
         * 10   15   7
         */
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.left.left=new TreeNode(10);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        PreOrder preOrder=new PreOrder();
        List<Integer> list = preOrder.PreOrderRaversal(root);
        for (Integer i:
             list){
            System.out.println(i);
        }
    }
}
