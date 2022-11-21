import java.util.Scanner;

public class Problem02 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt(), c = 0;
        int[][] map = new int[105][105];
        for (int i = 1; i <= n + 1; i++)
            for (int j = 1; j <= n + 1; j++) {
                if (i >= 1 && i <= n && j >= 1 && j <= n)
                    map[i][j] = in.nextInt();
                if (map[i][j] != map[i - 1][j]) c++;
                if (map[i][j] != map[i][j - 1]) c++;
            }
        System.out.println(c);
        in.close();
    }
}