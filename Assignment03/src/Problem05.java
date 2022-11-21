import java.util.Scanner;

public class Problem05 {
    private static final Scanner in = new Scanner(System.in);
    private static final int[][] board = new int[1005][1005], DIRECTS = {{0, 0}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};

    public static void main(String[] args) {
        int n = in.nextInt();
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                board[i][j] = in.nextInt();
        boolean flag = false;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                if (winnable(i, j)) {
                    System.out.printf("%d %d \n", i, j);
                    flag = true;
                }
        if (!flag) System.out.printf("%d\n", -1);
        in.close();
    }

    private static boolean winnable(int x, int y) {
        int[] c = new int[10];
        for (int i = 1; i <= 8; i++) {
            int x1 = x + DIRECTS[i][0], y1 = y + DIRECTS[i][1];
            while (board[x1][y1] != 0) {
                c[i]++;
                x1 += DIRECTS[i][0];
                y1 += DIRECTS[i][1];
            }
        }
        return c[1] + c[2] >= 4 || c[3] + c[4] >= 4 || c[5] + c[6] >= 4 || c[7] + c[8] >= 4;
    }
}