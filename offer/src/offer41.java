import java.util.ArrayList;

/**
 * 和为s的连续正数序列
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 返回值描述:
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * @author Dell
 */
public class offer41 {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer> >();
        //滑动的窗口,定义窗口的左右边界
        int i=1,j=1;
        int target=0;
        //如果左界的值大于sum/2，任意两个数相加都无法满足条件
        while(i<= sum/2){
            //窗口区间中的数值和小于目标值，右窗口滑动
            if(target<sum){
                target+=j;
                j++;
            }
            //窗口区间的值比目标值大，左窗口滑动
            else if(target>sum){
                target-=i;
                i++;
            }
            //相同的时候，将去接中的值保存到List中
            else{
                ArrayList list=new ArrayList<>();
                //这里n<j,如果加入等于的条件，就会造成多加入元素
                for(int n=i;n<j;n++){
                    list.add(n);
                }
                res.add(list);
                //添加结束后，如果不重新调整窗口大小，就会造成一直保存该结构集
                target-=i;
                ++i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int i=3;
        System.out.println(3/2);
        Math.
    }
}
