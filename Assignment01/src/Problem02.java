import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        double x1, x2, y1, y2, x, k, b, y;
        for (int i = 1; i <= t; i++) {
            x1 = input.nextDouble();
            y1 = input.nextDouble();
            x2 = input.nextDouble();
            y2 = input.nextDouble();
            x = input.nextDouble();
            k = (y2 - y1) / (x2 - x1);
            b = y1 - k * x1;
            y = k * x + b;
            System.out.printf("%.1f\n", y);
        }
    }
}
