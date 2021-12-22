import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * 思路：
 * 1，对数组进行排序
 * 2.从最开始出发，nums[i]>0，直接结束，num[i-1]==nums[i]的情况下，i++，做到去重
 * 3.设置双指针L和R，向后遍历，如果nums[L]和nums[R]与nums[i]和为0，将这三个数加入到结果集中
 * 4.nums[l]=nums[L+1],l++.nums[R]=nums[R-1]，R--
 *
 * 这道题的细节非常多
 */
public class leetcode15_3sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        //特殊值判空
        if (nums.length == 0) {
            return lists;
        }
        //对数组进行排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //如果nums[i]>0,直接结束循环
            if(nums[i]>0){
                break;
            }
            //如果num[i+1]==nums[i]跳过本次循环
            if(nums[i]==nums[i-1]){
                continue;
            }
            int L=i+1;
            int R=nums.length-1;
            ;
            while (L<R){
                int sum=nums[i]+nums[L]+nums[R];
                if (sum==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    //左右去重
                    while(L<R&&nums[L]==nums[L+1]){
                        L++;
                    }
                    while (L<R&&nums[R]==nums[R-1]){
                        R--;
                    }
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
                }
            }
        return lists;
        }

    public static void main(String[] args) {
        int[] nums=new int[]{-1,0,1,2,-1,-4};
        leetcode15_3sum leetcode15_3sum=new leetcode15_3sum();
        List<List<Integer>> lists = leetcode15_3sum.threeSum(nums);
        System.out.println(lists.toString());
    }
    }

