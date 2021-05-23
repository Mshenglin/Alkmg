import java.util.Arrays;

/**
 * 选择排序
 * 时间复杂度O（n^2）
 * 不稳定排序算法
 */
public class SelectSort {
    public static void theSelectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //用来标记最小的元素
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            if(i!=min){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
            }
        }

    public static void main(String[] args) {
        int[] arr=new int[]{7,5,4,3,2,1};
        SelectSort.theSelectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    }
