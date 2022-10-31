import java.io.*;

public class Problem02 {
    public static void main(String[] args) throws IOException {
        Read in = new Read(System.in);
        int[] numCounter = new int[1005];
        int n = in.nextInt();
        for (int i = 1; i <= n; i++)
            numCounter[in.nextInt()]++;
        boolean flag = false;
        for (int i = 1; i <= n; i++)
            if (numCounter[i] == 0)
                flag = true;
        if (flag) {
            int tmp;
            for (tmp = 1; tmp <= n; tmp++)
                if (numCounter[tmp] == 0) {
                    System.out.printf("%d", tmp);
                    break;
                }
            for (int i = tmp + 1; i <= n; i++)
                if (numCounter[i] == 0)
                    System.out.printf(" %d", i);
        } else {
            System.out.printf("NULL");
        }
//       in.close();
    }
}
