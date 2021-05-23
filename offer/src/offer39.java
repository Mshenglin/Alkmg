/**
 * 平衡二叉树
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 * 平衡二叉树（Balanced Binary Tree），具有以下性质：它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
 * @author Dell
 */
public class offer39 {
    public class Solution {
        //全局标记，用于返回
        boolean flag=true;
        public boolean IsBalanced_Solution(TreeNode root) {
            dfs(root);
            return flag;
        }
        public int dfs(TreeNode root){
            //递归的结束条件
            if(root == null){
                return 0;
            }
            //该节点左子树的深度
            int left=dfs(root.left)+1;
            //右子树的深度
            int right=dfs(root.right)+1;
            //判断左右子树的高度差
            if(Math.abs(left-right)>=2){
                flag=false;
            }
            //向父节点返回高度该节点的深度
            return Math.max(left,right);
        }
    }
}
