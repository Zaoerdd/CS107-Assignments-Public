import java.util.Scanner;

public class Problem01 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt(), m = n / 2;
        int[][][] a = new int[10][105][105], b = new int[10][105][105], c = new int[10][105][105];
        Read(a, m); Read(b, m);
        c[1] = addition(m, a[1], b[1], 1);
        c[2] = multiplication(m, a[2], transpose(m, b[2]));
        c[3] = multiplication(m, b[3], transpose(m, a[3]));
        c[4] = addition(m, a[4], b[4], -1);
        print(c, m);
        in.close();
    }

    private static int[][] addition(int m, int[][] a, int[][] b, int sign) {
        int[][] c = new int[105][105];
        for (int row = 1; row <= m; row++)
            for (int column = 1; column <= m; column++)
                c[row][column] = a[row][column] + b[row][column] * sign;
        return c;
    }

    private static int[][] multiplication(int m, int[][] a, int[][] b) {
        int[][] c = new int[105][105];
        for (int row = 1; row <= m; row++)
            for (int column = 1; column <= m; column++)
                for (int i = 1; i <= m; i++)
                    c[row][column] += a[row][i] * b[i][column];
        return c;
    }

    private static int[][] transpose(int m, int[][] a) {
        int[][] c = new int[105][105];
        for (int row = 1; row <= m; row++)
            for (int column = 1; column <= m; column++)
                c[row][column] = a[column][row];
        return c;
    }

    private static void Read(int[][][] a, int m) {
        for (int row = 1; row <= m; row++) {
            for (int column = 1; column <= m; column++)
                a[1][row][column] = in.nextInt();
            for (int column = 1; column <= m; column++)
                a[2][row][column] = in.nextInt();
        }
        for (int row = 1; row <= m; row++) {
            for (int column = 1; column <= m; column++)
                a[3][row][column] = in.nextInt();
            for (int column = 1; column <= m; column++)
                a[4][row][column] = in.nextInt();
        }
    }

    private static void print(int[][][] a, int m) {
        for (int row = 1; row <= m; row++) {
            for (int column = 1; column <= m; column++)
                System.out.printf("%d ", a[1][row][column]);
            for (int column = 1; column <= m; column++)
                System.out.printf("%d ", a[2][row][column]);
            System.out.print("\n");
        }
        for (int row = 1; row <= m; row++) {
            for (int column = 1; column <= m; column++)
                System.out.printf("%d ", a[3][row][column]);
            for (int column = 1; column <= m; column++)
                System.out.printf("%d ", a[4][row][column]);
            System.out.print("\n");
        }
    }
}