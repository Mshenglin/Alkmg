package Heap;

/**
 * 堆
 * @author
 */
public class Heap {
    private int[] a; // 数组，从下标1开始存储数据
    private int n; // 堆可以存储的最大数据个数
    private int count; // 堆中已经存储的数据个数
    public Heap(int capacity) {
        a = new int[capacity + 1];
        n = capacity;
        count = 0;
    }
    public void insert(int data) {
        //堆中的数据以满
        if(count>=n){
            return;
        }
        //将该数据插入到堆尾
        ++count;
        a[count] = data;
        int i=count;
        //从下到上堆化
        while(i/2>0&&a[i]>a[i/2]){
            swap(a,i,i/2);
            i=i/2;
        }
    }

    /**
     * 移除堆顶的元素，如果存在返回该元素的值，不存在返回-1
     * @return
     */
    public int removeMax() {
        if (count == 0){
            return -1; // 堆中没有数据
        }
        //将堆尾的元素移到第一个元素，这样做的好处是，在堆化过后，该堆还满足堆的定义
        int temp=a[1];
        a[1]=a[count];;
        --count;
        heapify(a, count, 1);
        return temp;
    }

    /**
     * 从上到下堆化
     * @param a
     * @param count
     * @param i
     * @return
     */
    private void heapify(int[] a, int count, int i) {
        while(true){
            //存储最大值元素的索引
            int max=i;
            if(i*2<=n&&a[i]<a[i*2]){
                max=i*2;
            }
            if(i*2+1<=n&&a[max]<a[i*2+1]){
                max=i*2+1;
            }
            if(max==i){
                return;
            }
            swap(a, i, max);
            i=max;
        }
    }

    private void swap(int[] a, int i, int i1) {
        int temp=a[i];
        a[i]=a[i1];
        a[i1]=temp;
    }
}
