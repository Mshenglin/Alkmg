package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 后序遍历
 * @author
 */
public class ThePostOrder {
    /**
     *后序遍历返回无法判断是左子树返回得到还是右子树返回得到所以需要记录存入时候的路径选择
     */
    List<Integer> list=new ArrayList<>();
    public List<Integer>  PostOrder(TreeNode root){
        if(root==null){
            return list;
        }
        //上次访问节点
        TreeNode lastVisitNode=null;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        //当前栈不为空
        while (!stack.isEmpty()){
            //在栈中查看当前访问节点
            root=stack.peek();
            //该节点的左右子树为空，或者存在左右子树，但是左右子树被访问过了
            if((root.left==null && root.right==null) ||
                    (lastVisitNode != null&&(lastVisitNode==root.left || lastVisitNode == root.right))){
                list.add(root.val);
                lastVisitNode=root;
                stack.pop();

            }
            else {
                if (root.right!= null) {
                    stack.push(root.right);
                }
                if (root.left != null) {
                    stack.push(root.left);
                }
            }

        }
        return  list;
    }

    public static void main(String[] args) {
        /**
         *     3
         *    / \
         *   9  20
         *  /  /  \
         * 10 15   7
         * 10->9->->15->7->20->3
         */
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.left.left=new TreeNode(10);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        ThePostOrder preOrder=new ThePostOrder();
        List<Integer> list = preOrder.PostOrder(root);
        for (Integer i:
                list){
            System.out.print(i+"\t");
        }
    }
}
