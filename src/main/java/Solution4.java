public class Solution4 {

    public static int remove(int a[]) {
        int j = 0;
        int i = 0;
        int sum = 0;
        for (i = 1; i < a.length; i++) {
            if (a[i] == a[j]) {
                sum = sum + 1;
                if (sum < 2) {
                    a[++j] = a[i];

                }
            } else {
                a[++j] = a[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3,3,3, 4};
        int j = remove(a);
        for (int i = 0; i < j; i++) {
            System.out.println(a[i]);
        }
    }

}
