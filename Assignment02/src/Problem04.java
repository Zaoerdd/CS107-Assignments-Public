import java.io.*;
import java.util.Arrays;

public class Problem04 {
    public static void main(String[] args) throws IOException {
        Read in = new Read(System.in);
        Card[] cards = new Card[5];
        for (int i = 0; i < 5; i++) {
            char suit = in.nextChar();
            int value = in.nextInt();
            cards[i] = new Card(suit, value);
        }
        Arrays.sort(cards);
        boolean flag = false;

        //Straight Flush
        if (!flag) {
            boolean is = true;
            for (int i = 0; i < 4; i++) {
                if (cards[i].value != cards[i + 1].value - 1 || cards[i].suit != cards[i + 1].suit) {
                    is = false;
                    break;
                }
            }
            if (is) {
                flag = true;
                System.out.printf("Straight Flush\n");
            }
        }

        //Flush
        if (!flag) {
            boolean is = true;
            for (int i = 0; i < 4; i++) {
                if (cards[i].suit != cards[i + 1].suit) {
                    is = false;
                    break;
                }
            }
            if (is) {
                flag = true;
                System.out.printf("Flush\n");
            }
        }

        //Straight
        if (!flag) {
            boolean is = true;
            for (int i = 0; i < 4; i++) {
                if (cards[i].value != cards[i + 1].value - 1) {
                    is = false;
                    break;
                }
            }
            if (is) {
                flag = true;
                System.out.printf("Straight\n");
            }
        }

        //Three of a Kind
        if (!flag) {
            boolean is = false;
            for (int i = 0; i < 3; i++) {
                if (cards[i].value == cards[i + 2].value) {
                    is = true;
                    break;
                }
            }
            if (is) {
                flag = true;
                System.out.printf("Three of a Kind\n");
            }
        }

        //Pair
        if (!flag) {
            boolean is = false;
            for (int i = 0; i < 4; i++) {
                if (cards[i].value == cards[i + 1].value) {
                    is = true;
                    break;
                }
            }
            if (is) flag = true;
            if (flag) {
                System.out.printf("Pair\n");
            } else {
                System.out.printf("High Card\n");
            }
        }
//        in.close();
    }

    static class Card implements Comparable {
        int value = 0;
        char suit = 0;

        Card(char suit, int value) {
            this.suit = suit;
            this.value = value;
        }

        @Override
        public int compareTo(Object o) {
            return value - ((Card) o).value;
        }
    }
}
