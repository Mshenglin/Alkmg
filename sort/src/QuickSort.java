import java.util.Arrays;
import java.util.Queue;

/**
 * 快速排序
 *O（nlogn）
 * 不稳定的排序算法
 * @author
 */
public class QuickSort {
    public static void quickSort(int[] arr) {
        quickSortInternally(arr, 0, arr.length-1);
    }

    private static void quickSortInternally(int[] arr, int p, int r) {
        //递归的终止条件
        if(p>=r){
            return;
        }
        //获取分区点
        int q=partition(arr,p,r);
        quickSortInternally(arr, p, q-1);
        quickSortInternally(arr, q+1, r);
    }

    /**
     * 获取分区点
     * @param arr 排序数组
     * @param p 起始位置
     * @param r 终止位置
     * @return
     */
    private static int partition(int[] arr, int p, int r) {
        int flag=arr[r];
        int i=p;
        for (int j=p; j < r ; j++) {
            if(flag>arr[j]){
                if (i == j) {
                    i++;
                }
                else {
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                }
            }

        }
        int temp =arr[i];
        arr[i]=arr[r];
        arr[r]=temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 5, 4, 3, 2, 1};
        QuickSort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
