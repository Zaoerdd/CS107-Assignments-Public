import java.io.*;

public class Problem05 {
    public static void main(String[] args) throws IOException {
        Read in = new Read(System.in);
        String endiannessIn = in.nextLine();
        for (String endianness : endiannessIn.split(" ")) {
            for (int j = 7; j > 0; j -= 2)
                System.out.printf("%c%c", endianness.charAt(j - 1), endianness.charAt(j));
            System.out.printf(" ");
        }
//       in.close();
    }
}
