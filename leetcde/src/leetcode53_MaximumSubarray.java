/**
 * 最大子数组和
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 * 使用动态规划，
 */
public class leetcode53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
    //特殊值的判断
    if(nums.length==0){
        return 0;
    }
    //用于存储转移状态
        int[] dp=new int[nums.length];
    //用于存储最大值
        int max=nums[0];
        //初始化初始状态
        dp[0]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if(dp[i-1]<0){
                dp[i]=nums[i];
            }
            else{
                dp[i]=dp[i-1]+nums[i];
            }

            max=Math.max(dp[i],max);
        }
        return max;
    }
}
