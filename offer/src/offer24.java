import java.util.ArrayList;

/**
 * 二叉树和为某一值的路径
 * @author
 */
public class offer24 {
    ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    ArrayList<Integer>  list=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        //特殊值，直接返回
        if(root==null){
            return res;
        }
        dfs(root,target);
        return res;

    }
    public void dfs(TreeNode root,int target){
        //将所走过的路径记录
        list.add(root.val);
        //更新值
        target-=root.val;
        //判断是否满足路径要求(和为目标值，并是叶子节点)将该路径加入结果集
        if(target==0&&root.left==null&&root.right == null){
            //由于直接将list加入只值，传递，当我们改变list的结构，会造成结果集中的元素变化
            res.add(new ArrayList<>(list));
        }
        //左右子树递归
        FindPath(root.left,target);
        FindPath(root.right,target);
        //在回溯的过程中，将不满足要求的子树移除，方便记录结果集
        list.remove(list.size()-1);
    }
}
