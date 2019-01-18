package dynamicprocess;

/**
 * m, n
 * 有障碍 其中 1 表示 障碍 ， 输入第二参数为列的数目。
 */
public class DynamicProcess5 {

    //列的长度
    public static int getPathNum(int b[][]) {

        int row = b.length;
        System.out.println(" row  " + row);

        int column = b[0].length;
        System.out.println("column = " + column);

        int a[][] = new int[row][column];

        //首元素初始化
        a[0][0] = b[0][0] == 0 ? 1 : 0;

        for (int i = 1; i < column; i++) {
            a[0][i] = (a[0][i - 1] == 1 && b[0][i] == 0) ? 1 : 0;
        }
        for (int i = 1; i < row; i++) {
            a[i][0] = (a[i - 1][0] == 1 && b[i][0] == 0) ? 1 : 0;
        }

        for (int i = 1; i < row; i++)
            for (int j = 1; j < column; j++) {
                if (b[i][j] == 1) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = a[i - 1][j] + a[i][j - 1];
                }
            }

        return a[row - 1][column - 1];
    }

    public static void main(String[] args) {

        int m = 2;
        int n = 3;
        int b[][] = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = 0;
        System.out.println(getPathNum(b));
    }
}
