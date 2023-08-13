import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
       int[] a = {9,3,7,2,5,8,1,4};
       insert(a);
    }

    private static void insert(int[] a){
        int n = a.length;
        // i 代表待插入元素的索引
        for(int i=1;i<n;i++){
            int t = a[i];// 代表待插入的元素值
            int j = i-1;
            while(j>=0){
                if (t<a[j]){
                    a[j+1] = a[j];
                }else{
                    break;
                }
                j--;
            }
            a[j+1] = t;
            System.out.println(Arrays.toString(a));
        }
    }
}
