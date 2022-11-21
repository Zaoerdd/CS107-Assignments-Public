import java.util.Scanner;

public class Problem03 {
    private static final Scanner in = new Scanner(System.in);
    private static final double[] rArea = {0, Math.PI / 4, Math.PI / 4, Math.PI / 6 + Math.sqrt(3.00) / 4, Math.PI / 4, Math.PI / 6 + Math.sqrt(3.00) / 4, 1.00, 1.00, Math.PI / 4, 1.00, Math.PI / 6 + Math.sqrt(3.00) / 4, 1.00, Math.PI / 6 + Math.sqrt(3.00) / 4, 1.00, 1.00, 1.00};
    private static final int[][] DIRECTS = {{0, 0}, {1, 0}, {0, 1}, {1, 1}};

    public static void main(String[] args) {
        double area = 0.00;
        int n = in.nextInt();
        int[][] canvas = new int[505][505], flagS = new int[505][505], flagR = new int[505][505];
        for (int i = 1; i <= n; i++) {
            int shape = in.nextInt(), x = in.nextInt(), y = in.nextInt();
            canvas[x + 200][y + 200] = Math.max(shape, canvas[x + 200][y + 200]);
        }
        for (int i = 1; i <= 400; i++) {
            for (int j = 1; j <= 400; j++) {
                if (canvas[i][j] == 2)
                    flagS[i][j] = flagS[i + 1][j] = flagS[i][j + 1] = flagS[i + 1][j + 1] = 1;
                else if (canvas[i][j] == 1)
                    for (int direct = 0; direct < 4; direct++)
                        flagR[i + DIRECTS[direct][0]][j + DIRECTS[direct][1]] += (int) Math.pow(2.00, direct);
            }
        }
        for (int i = 1; i <= 400; i++)
            for (int j = 1; j <= 400; j++)
                area += (flagS[i][j] == 1) ? 1.00 : rArea[flagR[i][j]];
        System.out.printf("%.5f\n", area);
        in.close();
    }
}