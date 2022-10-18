import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] isLeapYear = new boolean[3000];
        for (int i = 1; i <= 2000; i++) {
            if (i % 400 == 0) {
                isLeapYear[i] = true;
            } else if (i % 100 != 0 && i % 4 == 0) {
                isLeapYear[i] = true;
            } else {
                isLeapYear[i] = false;
            }
        }
        int t = input.nextInt();
        for (int i = 1; i <= t; i++) {
            int y = input.nextInt();
            int totalDays=0;
            for(int j=y;j<2000;j++)
            {
                if(isLeapYear[j]){
                    totalDays+=366;
                }else {
                    totalDays+=365;
                }
            }
            if(isLeapYear[y]){
                System.out.println("Yes");
                System.out.println(totalDays-59);
            }else {
                System.out.println("No");
            }
        }
    }
}
