package BinaryTree;

import java.util.*;

/**
 * 二叉树的层序遍历
 * @author
 */
public class LayerOrder {
    List<Integer> list=new ArrayList<>();
    public List<Integer>  LayerSequenceTraversal(TreeNode root){
        if(root==null){
            return list;
        }
        //创建队列
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        TreeNode cur=null;
        while(!queue.isEmpty()){
            cur=queue.remove();
            list.add(cur.val);
            if (cur.left!=null){
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
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
        LayerOrder preOrder=new LayerOrder();
        List<Integer> list = preOrder.LayerSequenceTraversal(root);
        for (Integer i:
                list){
            System.out.println(i);
        }


    }
}
