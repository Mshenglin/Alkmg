/**
 * 二叉树的深度
 * @author Dell
 */
public class offer38 {
    public int TreeDepth(TreeNode root) {
        //递归结束的条件
        if(root==null){
            return 0;
        }//左子树的深度
        int leftDepth=TreeDepth(root.left);
        //右子树的深度
        int rightDepth=TreeDepth(root.right);
        //返回左子树和右子树中的最大值+1
        return Math.max(leftDepth,rightDepth)+1;
    }
}
