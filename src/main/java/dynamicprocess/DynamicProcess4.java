package dynamicprocess;

import java.util.ArrayList;
import java.util.List;

/**
 * m, n
 * 矩阵 到达最后一个的总的路径数目是多少 。
 *
 * m = 2 , n =3 时候
 *    \----\---\
 *    \----\---\
 *    总共三条路径
 */
public class DynamicProcess4 {

    public static int getPathNum(int m, int n) {
        int a[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            a[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            a[i][0] = 1;
        }

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++) {
                a[i][j] = a[i - 1][j] + a[i][j - 1];
            }

        return a[m - 1][n - 1];
    }

    public static  void main(String[] args) {
        System.out.println(getPathNum(2,3));
    }
}
