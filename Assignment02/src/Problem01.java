import java.io.*;

public class Problem01 {
    public static void main(String[] args) throws IOException {
        Read in = new Read(System.in);
        int n = in.nextInt();
        for (int k = 0; k < n; k++) {
            int[] num01 = new int[105], num02 = new int[105], ans = new int[105];
            int len01 = in.nextInt(), len02 = in.nextInt();
            int len = Math.max(len01, len02);
            for (int i = len01 - 1; i >= 0; i--)
                num01[i] = in.nextInt();
            for (int i = len02 - 1; i >= 0; i--)
                num02[i] = in.nextInt();
            for (int i = 0; i < len; i++) {
                ans[i] += (num01[i] + num02[i]);
                if (ans[i] > 9) {
                    ans[i] -= 10;
                    ans[i + 1]++;
                }
            }
            if (ans[len] != 0)
                System.out.printf("%d", ans[len]);
            for (int i = len - 1; i >= 0; i--)
                System.out.printf("%d", ans[i]);
            System.out.print("\n");
        }
//        in.close();
    }
}