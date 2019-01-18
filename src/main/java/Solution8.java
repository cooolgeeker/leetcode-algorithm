import java.util.ArrayList;
import java.util.List;

/**
 * 二分查找
 */
public class Solution8 {
    public static int min(int a, int b) {
        return a > b ? b : a;
    }


    public static int search(int a[]) {
        int size = a.length;

        if (size == 0) {
            return 0;
        } else if (size == 1) {
            return a[0];
        } else if (size == 2) {
            return min(a[0], a[1]);
        }
        int start = 0;
        int stop = size - 1;
        while (start < stop - 1) {
            if (a[start] < a[stop]) {
                return a[start];
            }
            int mid = start + (stop - start) / 2;
            if (a[mid] > a[start]) {
                start = mid;
            } else if (a[mid] < a[start]) {
                stop = mid;
            }
        }
        return min(a[start], a[stop]);
    }


    public static void main(String[] args) {

//        int a[] = {7, 1, 2, 3, 4, 5, 6};
//        int b = search(a);
//        System.out.println(" b = " + b);

        List<Integer> a = new ArrayList<Integer>();

        a.add(11);

        a.add(22);

        System.out.println( a.toString() );

        a.remove(a.size() -1);

        System.out.println( a.toString() );
    }

}
