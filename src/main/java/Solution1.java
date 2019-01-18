/**
 *
 */
public class Solution1 {

    public static int remove(int a[], int element) {
        int j = 0;
        int i = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == element) {
                continue;
            }
            a[j] = a[i];
            j++;
        }
        return j;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3,4};
        int j = remove(a,3);
        for(int i = 0 ; i < j; i++)
        {
            System.out.println( a[i]);
        }
    }

}
