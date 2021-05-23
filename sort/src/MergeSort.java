import java.util.Arrays;

/**
 * 归并排序
 *时间复杂度O（nlogn）
 * 稳定的排序算法
 * @author
 */
public class MergeSort {
    public static void theMergeSort(int[] arr) {
        mergeSortInternally(arr, 0, arr.length - 1);
    }

    /**
     * 递归调用函数
     *
     * @param arr 要排序的数组
     * @param p   起始位置
     * @param r   终止位置
     */
    private static void mergeSortInternally(int[] arr, int p, int r) {
        //当只有一个元素的时候
        if (p >= r) {
            return;
        }
        //找到数组的中间位置
        int q = p + (r - p) / 2;
        mergeSortInternally(arr, p, q);
        mergeSortInternally(arr, q + 1, r);
        merge(arr, p, q, r);
    }

    //将以排序的数据进行合并
    private static void merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int k = 0;
        //临时数组
        int[] temp = new int[r - p + 1];
        //将两个数组的元素向临时数组中排序,其中一定有一部分数组元素排序完成
        while (i<=q&&j<=r){
            if (arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];
            }
        }
        //判断那部分数组中还存在元素
        int start=i;
        int end=q;
        if(j<=r){
            start=j;
            end=r;
        }
        //将剩余元素存入临时数组中
        while (start<=end){
            temp[k++]=arr[start++];
        }
        //将临时数组中的元素存入arr中
        for (int l = 0; l <temp.length ; l++) {
            arr[p+l]=temp[l];
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[]{7, 5, 4, 3, 2, 1};
        MergeSort.theMergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
