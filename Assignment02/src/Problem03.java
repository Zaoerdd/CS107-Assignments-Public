import java.util.*;
import java.util.stream.IntStream;

public class Problem03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int count = 0; count < t; count++) {
            List<Section> sections = new ArrayList<>();
            int[] scoreList = new int[10], daysList = new int[10];
            for (int i = 0; i < 4; i++)
                scoreList[i] = in.nextInt();
            for (int i = -0; i < 4; i++)
                daysList[i] = in.nextInt();
            for (int i = 0; i < 4; i++)
                sections.add(new Section(scoreList[i], daysList[i]));
            Collections.sort(sections);
            IntStream stream = Arrays.stream(scoreList);
            int total = stream.sum();
            if (total >= 100) {
                System.out.printf("0\n");
                continue;
            }
            int ans = 0;
            for (int i = 0; i < 4; i++) {
                Section nowSection = sections.get(i);
                while (nowSection.score < 30 && total < 100) {
                    total++;
                    nowSection.score++;
                    ans += nowSection.needDays;
                }
                if (total == 100) break;
            }
            System.out.printf("%d\n", ans);
        }
    }

    static class Section implements Comparable {
        int score;
        int needDays;

        Section(int score, int needDays) {
            this.score = score;
            this.needDays = needDays;
        }

        @Override
        public int compareTo(Object o) {
            return needDays - ((Section) o).needDays;
        }
    }
}