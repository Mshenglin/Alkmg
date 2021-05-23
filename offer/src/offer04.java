import java.util.HashMap;

/**
 * 重建二叉树
 * @author
 */
public class offer04 {
    //用来存放中序遍历数组的下标索引
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] preorder,int [] inorder) {
        //特殊情况，返回
        if(preorder.length==0){
            return null;
        }
        //将中序遍历放入map中，方遍取到索引
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int preR=preorder.length-1;
        int midR=inorder.length-1;
        int preL=0;
        int midL=0;
        return  build(preorder,inorder,preL,preR,midL,midR);

    }
    public TreeNode build(int[] preorder,int[] inorder,int preL,int preR,int midL,int midR){
        if(preR<preL||midR<midL){
            return null;
        }
        TreeNode   root=new TreeNode(preorder[preL]);
        //取到中序遍历该节点的索引位置
        int k=map.get(preorder[preL]);
        root.left=build(preorder,inorder,preL+1,preL+k-midL,midL,k-1);
        root.right=build(preorder,inorder,preL+k-midL+1,preR,k+1,midR);
        return root;
    }
}
