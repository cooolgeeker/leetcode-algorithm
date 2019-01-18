package dynamicprocess;

/**
 * 只能交易一次最大利润是多少
 */
public class DynamicProcess1 {

    public static int getLowProfit(int a[]) {
        int minProfit = a[0];
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            minProfit = min(minProfit, a[i]);
            sum = max(a[i] - minProfit, sum);
        }
        if (sum < 0) {
            return 0;
        }
        return sum;
    }

    public static int min(int a, int b) {
        return a > b ? b : a;
    }

    public  static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static  void main(String[] args) {
        int a[]={1, 2 , 3, 4, 5,6,100,3};
        System.out.println(getLowProfit(a));
    }
}
