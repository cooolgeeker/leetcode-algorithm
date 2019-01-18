package dynamicprocess;

/**
 * 不限定次数
 */
public class DynamicProcess2 {

    public static int getLowProfit(int a[]) {
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            int tmp = a[i] - a[i-1];
            if(tmp > 0)
            {
                sum = sum + tmp;
            }
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

        int b[] = {1,2,0,4};
        System.out.println(getLowProfit(b));
    }
}
