import java.util.Arrays;

/**
 * 插入排序
 * 时间复杂度最好o(n) 最坏o（n^2）
 * 稳点的排序算法
 * @
 */
public class InsertSort {
    public  static void theInsertSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
        //标记当前要比较的元素
            int temp=arr[i];
            int j=i;
            while(j>0 && temp<arr[j-1]){
                //数据搬移
                arr[j]=arr[j-1];
                j--;
            }
            //将标记的元素插入到指定位置
            if(j!=i){
                arr[j]=temp;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{7,5,4,3,2,1};
        InsertSort.theInsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
