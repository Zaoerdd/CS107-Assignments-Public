import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        String[] yMonth = {"0", "yes", "no", "yes", "no", "yes", "no", "yes", "yes", "no", "yes", "no", "yes"};
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int month = input.nextInt();
            System.out.println(yMonth[month]);
        }
    }
}
