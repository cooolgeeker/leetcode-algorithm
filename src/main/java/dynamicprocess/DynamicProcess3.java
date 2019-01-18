package dynamicprocess;

import java.util.ArrayList;
import java.util.List;

/**
 * 买两次
 */
public class DynamicProcess3 {

    /**
     * @param a
     * @param skip
     * @return  返回最小值和下标
     */
    public static List<Integer> getLowProfitList(int a[], int skip) {
        int minProfit = a[0];
        int sum = 0;
        int start = 0;
        for (int i = 1; i < a.length; i++) {
            //这个值不能参加预算了
            if(i == skip) {
                continue;
            }
            if (minProfit > a[i]) {
                start = i;
            }
            minProfit = min(minProfit, a[i]);
            sum = max(a[i] - minProfit, sum);
        }
        if (sum < 0) {
            sum = 0;
        }
        List<Integer> ret = new ArrayList<>();
        ret.add(sum);
        ret.add(start);
        return ret;
    }


    /**
     * @param a
     * @return
     */
    public static int getLowProfit(int a[]) {
        List<Integer>  list = getLowProfitList(a, -1);

        int sum = list.get(0);
        int end = list.get(1);
        System.out.println("sum = " + sum);
        System.out.println("end = " + end);

        List<Integer>  list2 = getLowProfitList(a, end);
        sum = sum  + list2.get(0);
        return sum;
    }




    public static int min(int a, int b) {
        return a > b ? b : a;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 4, 5, 6, 100, 3};
//        System.out.println(getLowProfit(a));

        int b[] = {1, 2, 0, 4};
        System.out.println(getLowProfit(b));
    }
}
