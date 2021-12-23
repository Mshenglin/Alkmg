import java.util.HashMap;

/**
 * 1.两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 */
public class leetcode01_twoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //用于返回结果
            int[] ans=new int[2];
            //特殊值判断
            if(nums.length<2){
                return ans;
            }
            //使用哈HashMap存储元素
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i],i);
                }
                int s=target-nums[i];
                if(map.containsKey(s)&&map.get(s)!=i){
                    ans[0]=map.get(s);
                    ans[1]=i;
                    break;
                }
            }
            return ans;
        }
    }
}
