import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numCounter = new int[1000];
        int n = in.nextInt();
        for (int i = 1; i <= n; i++)
            numCounter[in.nextInt()]++;
        boolean flag = false;
        for (int i = 1; i <= n; i++)
            if (numCounter[i] == 0)
                flag = true;
        if (flag) {
            int tmp = 0;
            for (tmp = 1; tmp <= n; tmp++) {
                if (numCounter[tmp] == 0) {
                    System.out.printf("%d", tmp);
                    break;
                }
            }
            for (int i = tmp + 1; i <= n; i++)
                if (numCounter[i] == 0)
                    System.out.printf(" %d", i);
        } else {
            System.out.printf("NULL");
        }
    }
}
