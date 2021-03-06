import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 字符串的排序
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列
 * 出来的所有字符串abc,acb,bac,bca,cab和cba。
 * @author
 */
public class offer27 {
    //用于结果集的返回
    ArrayList<String> list= new ArrayList<>();
    //多叉树的决策递归
    HashMap<Character,Integer> map=new HashMap<>();
    public ArrayList<String> Permutation(String str) {
        int strLen=str.length();
        //判断特殊情况
        if(strLen==0){
            return list;
        }
        //将字符串拆分成字符数组
        char[] charArr=new char[strLen];
        for(int i=0;i<strLen;i++){
            charArr[i]=str.charAt(i);

        }
        ArrayList<Character> path= new ArrayList<>();
        //回溯递归函数
        backTrack(charArr,path);
        return list;
    }
    public void  backTrack(char[] charArr,ArrayList<Character> path){
        //递归的结束条件。
        if(path.size()==charArr.length){
            //将路径中的字符转化为字符串，存入结果集中
            char[] a=new char[path.size()];
            for (int i = 0; i < path.size() ; i++) {
                a[i]=path.get(i);
            }
            String temp=new String(a);
            if(!list.contains(temp)){
                list.add(temp);
            }
            return;
        }

        for(int i=0;i<charArr.length;i++){
            //前序遍历选择路径，排除不合法的选择
            if((map.containsKey(charArr[i]) && map.get(charArr[i])==count(charArr,charArr[i]))){
                continue;
            }
            if(map.containsKey(charArr[i])){
                map.put(charArr[i],map.get(charArr[i])+1);
            }
            else{
                map.put(charArr[i],1);
            }
            path.add(charArr[i]);
            backTrack(charArr,path);
            //后序遍历回溯移除路径
            map.put(charArr[i],map.get(charArr[i])-1);
            path.remove(path.size()-1);

        }
    }
    public  int  count(char[] a,char temp){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==temp){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Character> arrayList=new ArrayList<>();
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('c');
        arrayList.add('d');
        char[] a=new char[arrayList.size()];
        for (int i = 0; i < arrayList.size() ; i++) {
            a[i]=arrayList.get(i);
        }
        System.out.println(Arrays.toString(a));
    }
}
