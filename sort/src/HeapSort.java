import java.util.Arrays;

/**
 * @author 堆排序
 * 不稳定的排序算法
 * O（nlogn）
 */
public class HeapSort {
    /**
     * 堆排序，数组的下标是从0开始
     */
    public static void sort(int[] arr) {
        if (arr == null) {
            return;
        }
        //将该数据建成堆
        buildHeap(arr);
        //排序
        int k=arr.length-1;
        while (k>0){
            //将堆顶的元素和堆尾的元素交换
            swap(arr,0,k);
            //将剩余的元素堆化
            heapify(arr, --k, 0);
        }
    }

    /**
     * 堆化
     * @param arr 要堆化的数组
     * @param n 最后堆化的元素下标
     * @param i 要堆化的元素下标
     */
    private  static void heapify(int[] arr, int n, int i) {
        //记录最大元素的索引
        int max=i;
        while(true){
            if(i*2+1<=n&&arr[i]<arr[i*2+1]){
                max=i*2+1;
            }
            if(i*2+2<=n&&arr[max]<arr[i*2+2]){
                max=i*2+2;
            }
            if(max==i){
                break;
            }
            swap(arr, i, max);
            i=max;
        }


    }
    private static void swap(int[] arr, int i, int k) {
        int temp=arr[i];
        arr[i]=arr[k];
        arr[k]=temp;
    }

    /**
     * 建堆函数
     * @param arr
     */
    private static void buildHeap(int[] arr) {
        //建堆使在原有的数组上建堆，又由于是从上向下堆化，所以叶子节点无需堆化
        //arr.length-1/2是最后一个叶子节点，从最后一个叶子节点依次堆化到根节点
        for (int i = (arr.length-1)/2; i >=0; i--) {
            heapify(arr, arr.length-1, i);
        }
    }

    public static void main(String[] args) {
        int[] a= new int[]{5,3,7,8,9,1};
        HeapSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
