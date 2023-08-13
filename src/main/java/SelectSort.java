import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] a = {9,3,7,2,5,8,1,4};
        selection(a);
    }


    public static void selection(int[] a){
        int n = a.length;
        // i 代表每轮选择最小元素要交换到的目标索引
        for (int i = 0; i <n-1 ; i++) {
            int s = i;// 代表最小元素的索引
            for(int j=i+1;j<n;j++){
                if (a[s]>a[j]){// j 元素比 s 元素还要小, 更新 s
                    s = j;
                }
            }
            if(s!=i){
                swap(a,s,i);
            }
            System.out.println(Arrays.toString(a));
        }
    }

    private static void swap(int[] a, int s, int i) {

        int tmp = a[s];
        a[s] = a[i];
        a[i] = tmp;
    }
}
