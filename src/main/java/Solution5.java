import java.util.ArrayList;
import java.util.List;
//这个又问题后面再修复
public class Solution5 {

    List<int[]> all = new ArrayList<int[]>();
    int b[] = new int[1000];
    int blength = 0;

    public int sum() {
        int sum = 0;
        int i = 0;
        for (i = 0; i < blength; i++) {
            sum = sum + b[i];
        }
        return sum;
    }


    public void count(int a[], int sum, int k , int depth) {
        if (blength == k && sum() == sum) {
            all.add(a);
        }
        for( int i = depth ; i < a.length ; i++) {
            b[depth] = a[i];
            int tmp = blength;
            blength = depth + 1;
            count(a, sum, k, depth + 1);
            blength = tmp;
        }
    }

    public void print()
    {
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i)+ " ");
        }
    }


    public static void main(String[] args) {

        Solution5 solution5 = new Solution5();

        int a[] = {1, 2, 3, 3, 3, 3, 4};

        solution5.count(a, 6, 2, 0);


    }

}
