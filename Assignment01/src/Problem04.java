import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int score, a = 0, b = 0, c = 0, d = 0, f = 0;
        for (int i = 1; i <= t; i++) {
            score = input.nextInt();
            if (score >= 90) {
                a++;
            } else if (score >= 80) {
                b++;
            } else if (score >= 70) {
                c++;
            } else if (score >= 60) {
                d++;
            } else {
                f++;
            }
        }
        System.out.printf("A: %d\nB: %d\nC: %d\nD: %d\n", a, b, c, d);
    }
}
