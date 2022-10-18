import java.util.*;

public class Problem05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String endiannessIn = in.nextLine();
        for (String endianness : endiannessIn.split(" ")) {
            for (int j = 7; j > 0; j -= 2)
                System.out.printf("%c%c", endianness.charAt(j - 1), endianness.charAt(j));
            System.out.printf(" ");
        }
    }
}
