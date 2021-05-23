/**
 * 二分搜索树的后续遍历序列
 * 根据二分搜索树的特征：左子树小于根节点，右子树大于根节点
 * 后续遍历特征，根节点在最后一个元素找到第一个大于该节点的值，判断左边是否小于该值，右边是否大于钙质
 * @author
 *
 */
public class offer23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        //判断特殊情况
        if(sequence.length==0){
            return false;
        }
        int left=0;
        int right=sequence.length-1;
        return isVerifySquenceOfBST(sequence,left,right);
    }
    public boolean isVerifySquenceOfBST(int[] arr,int left,int right){
        //递归终止条件
        if(left>right){
            return true;
        }
        //寻找第一个大于根节点的元素
        int leftMid=childrenLeftNode(arr,left,right);
        //判断左边的元素是否小于根节点
        for(int i=left;i<leftMid;i++){
            if(arr[i]>arr[right]){
                return false;
            }
        }
        for(int i=leftMid;i<right;i++){
            if(arr[i]<arr[right]){
                return false;
            }
        }
        return isVerifySquenceOfBST(arr,left,leftMid-1)&&isVerifySquenceOfBST(arr,leftMid,right-1);

    }
    public int childrenLeftNode(int[] arr,int left,int right){
        //这个点，需要注意特殊情况
        int temp=right;
        for(int i=left;i<right;i++){
            if(arr[i]>arr[right]){
                temp=i;
                break;
            }
        }
        return temp;
    }
}
