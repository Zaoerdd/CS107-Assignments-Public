import java.util.Arrays;
import java.util.Scanner;

public class Problem04 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m = in.nextInt(), n = in.nextInt(), x = 1, y = 1, count = 0;
        int[][] matrix = new int[105][105], flag = new int[105][105], DIRECTS = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for (int i = 1; i <= m; i++)
            Arrays.fill(flag[i], 1, n + 1, 1);
        for (int i = 1; i < m * n; i++) {
            matrix[x][y] = in.nextInt();
            flag[x][y] = 0;
            while (flag[x + DIRECTS[count % 4][0]][y + DIRECTS[count % 4][1]] == 0) count++;
            x += DIRECTS[count % 4][0];
            y += DIRECTS[count % 4][1];
        }
        matrix[x][y] = in.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++)
                System.out.printf("%d ", matrix[i][j]);
            System.out.print("\n");
        }
        in.close();
    }
}