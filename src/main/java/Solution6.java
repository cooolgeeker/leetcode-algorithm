import java.util.ArrayList;
import java.util.List;


/**
 * 二分查找
 */
public class Solution6 {
    public static int search(int a[], int k) {
        int start = 0;
        int stop = a.length - 1;
        while (start <= stop) {
            int mid = (start + stop) / 2;
            if (a[mid] > k) {
                stop = mid - 1;
            } else if (a[mid] < k) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {


//        int a[] = {1, 2, 3, 3, 3, 3, 4};
//
//        System.out.println( search(a,3));
//        System.out.println( search(a,5));
//        System.out.println( search(a,0));
//        System.out.println( search(a,1));
//        System.out.println( search(a,4));


        int b[] = {1, 2, 3, 3, 3, 4};

        System.out.println( search(b,3));
        System.out.println( search(b,5));
        System.out.println( search(b,0));
        System.out.println( search(b,1));
        System.out.println( search(b,4));

    }

}
