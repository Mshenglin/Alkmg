/**
 * 二叉树与双向链表
 * 题目描述
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @author
 */
public class offer26 {
    /**
     *是用二分搜索树中序遍历有序性的特征
     */
    //双向链表的前后指针
    TreeNode pre=null;
    TreeNode cur=null;
    TreeNode head=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        //特殊情况。直接返回
        if(pRootOfTree==null){
            return null;
        }
        dfs(pRootOfTree);
        return head;
    }
    public void dfs(TreeNode root){
        //递归的结束条件
        if(root==null){
            return;
        }
        dfs(root.left);
        if(pre==null){
            head=root;
            pre=root;
            cur=root;
        }
        else{
            pre=root;
            root.left=cur;
            cur.right=pre;
            cur=pre;
        }
        dfs(root.right);
    }
}
