import java.util.HashMap;

/**
 *使用滑动的窗口的思想
 *定义左右边界，首先移动右边界，map记录窗口元素出现的次数，然后移动左边界排除重复的元素
 */
public class leetcode03_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s==null){
            return 0;
        }
        if(s.equals(" ")){
            return 1;
        }
        //定义窗口的左右边界
        int  left=0;
        int right=0;
        int count=0;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        while(right<s.length()){
            char c=s.charAt(right);
            right++;
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                char k=s.charAt(left);
                left++;
                map.put(k,map.getOrDefault(k,0)-1);
            }
            count=Math.max(right-left,count);
        }
        return count;
    }
}
