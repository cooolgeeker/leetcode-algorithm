package dynamicprocess;

/**
 * m, n
 *  加权的路径问题
 */
public class DynamicProcess6 {

    //列的长度
    public static int getPathNum(int b[][]) {

        int row = b.length;
        System.out.println(" row  " + row);

        int column = b[0].length;
        System.out.println("column = " + column);

        int a[][] = new int[row][column];

        //首元素初始化
        a[0][0] = b[0][0] ;

        for (int i = 1; i < column; i++) {
            a[0][i] = a[0][i - 1] + b[0][i] ;
        }
        for (int i = 1; i < row; i++) {
            a[i][0] = a[i - 1][0]  +  b[i][0] ;
        }

        for (int i = 1; i < row; i++)
            for (int j = 1; j < column; j++) {
                {
                    a[i][j] = getMin(a[i - 1][j] ,a[i][j - 1]) + b[i][j];
                }
            }

        return a[row - 1][column - 1];
    }

    public static int getMin(int a, int b)
    {
        return  a>b?b:a;
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 3;
        int b[][] = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = 1;
        b[0][0] = 0 ;

        System.out.println(getPathNum(b));
    }
}
