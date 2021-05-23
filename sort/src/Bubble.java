import java.util.Arrays;

/**
 * 冒泡排序
 *最好的时间复杂度是O（n），最坏是O（n^2）,稳定的排序
 * @author
 */
public class Bubble {
    public static void main(String[] args) {
        int[] a = new int[]{1, 7, 5, 3, 2, 0};
        Bubble bubble = new Bubble();
        bubble.sort(a);
        System.out.println(Arrays.toString(a));

    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag=true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j]>arr[j+1]){
                flag=false;
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
            if (flag){
                return;
            }
        }
    }
}