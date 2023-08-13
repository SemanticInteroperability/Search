
import java.util.Arrays;


public class Bubble {
    public static void main(String[] args) {
        int[] array = {1, 5, 8, 11, 7, 22, 20, 35, 40, 36, 48, 43, 50};
        bubble_v2(array);
    }

    /**
     * //每轮冒泡时，最后一次交换索引可以作为下一轮冒泡的比较次数，如果这个值为零，表示整个数组有序，直接退出外层循环即可
     * @param a
     */
    public static void bubble_v2(int[] a){
        int n = a.length-1;
        while (true){
            // 表示最后一次交换索引位置
            int last = 0;
            for(int i=0;i<n;i++){
                System.out.println("比较次数" + i);
                if (a[i]>a[i+1]){
                    swap(a,i,i+1);
                    last=i;

                }
            }
            n=last;
            System.out.println("第轮冒泡"
                    + Arrays.toString(a));
            if(n == 0){
                break;
            }
        }
    }

    /**
     * * 优化点1：每经过一轮冒泡，内层循环就可以减少一次
     * * 优化点2：如果某一轮冒泡没有发生交换，则表示所有数据有序，可以结束外层循环
     * @param a
     */
    public static void bubble_v1(int[] a) {
        for (int j = 0; j < a.length - 1; j++) {
            // 一轮冒泡
            boolean swapped = false; // 是否发生了交换
            for (int i = 0; i < a.length - 1 - j; i++) {
                System.out.println("比较次数" + i);
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }
            System.out.println("第" + j + "轮冒泡"
                    + Arrays.toString(a));
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] a, int i, int i1) {
        int tmp = a[i];
        a[i] = a[i+1];
        a[i+1] = tmp;
    }
}
