public class BinarySearch {
    public static void main(String[] args) {
       //奇数二分取中间，偶数二分取中间靠左

        int[] array = {1, 5, 8, 11, 19, 22, 31, 35, 40, 45, 48, 49, 50};
        int target = 48;
        int idx = binarySearch(array, target);
        System.out.println(idx);
    }

    public static int binarySearch(int[] a, int t) {
        int l = 0, r = a.length - 1, m;
        while (l <= r) {
            //当 l 和 r 都较大时，`l + r` 有可能超过整数范围，造成运算错误，解决方法有两种：
            //m = (l + r) / 2;
            //int m = l + (r - l) / 2;
            m=(l+r)>>>1;
            if (a[m] == t) {
                return m;
            } else if (a[m] > t) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
