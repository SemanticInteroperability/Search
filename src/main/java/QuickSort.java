import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {9,3,7,2,5,8,1,4};
        quick(a,0,a.length-1);
    }

    public static void quick(int[] a,int l,int h){
        if(l>=h){
            return;
        }
        int p = partitionDouble(a, l, h);
        quick(a,l,p-1);//左边分区的范围确定
        quick(a,p+1,h);//右边分区的范围确定
    }


    public static int partitionSingle(int[] a,int l,int h){
        int pv = a[h];//基准点元素
        int i = l;
        for(int j = l;j<h;j++){
            if (a[j]<pv){
                if (i != j) {
                    swap(a,i,j);
                }
                i++;
            }
        }
        if (i != h) {
            swap(a,i,h);
        }

        System.out.println(Arrays.toString(a) + " i=" + i);
        //返回值代表了基准点元素所在的正确索引，用它确定下一轮分区的边界
        return i;
    }

    public static int partitionDouble(int[] a,int l,int h){
        int pv = a[l];//基准点元素
        int i=l,j=h;
        while(i<j){
            // j 从右找比基准点元素小的，找到就退出内循环
            while(i<j && a[j]>pv){
                j--;
            }
            //i 从左找比基准点元素大的，找到就退出内循环
            while(i<j && a[i]<=pv){
                i++;
            }
            swap(a,i,j);
        }
        //将基准点元素交换到i（此时i=j）索引位置上
        swap(a,l,i);
        System.out.println(Arrays.toString(a) + " i=" + i);
        //返回值代表了基准点元素所在的正确索引，用它确定下一轮分区的边界
        return i;
    }

    private static void swap(int[] a, int s, int i) {
        int tmp = a[s];
        a[s] = a[i];
        a[i] = tmp;
    }
}
