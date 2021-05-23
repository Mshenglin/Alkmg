
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 层序遍历二叉树
 * @author Dell
 */
public class offer22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        //用来存放遍历出来的元素
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        TreeNode cur=null;
        while(!qu.isEmpty()){
            cur=qu.poll();
            list.add(cur.val);
            if(cur.left!=null){
                qu.add(cur.left);
            }
            if(cur.right!=null){
                qu.add(cur.right);
            }
        }
        return list;
    }
}
