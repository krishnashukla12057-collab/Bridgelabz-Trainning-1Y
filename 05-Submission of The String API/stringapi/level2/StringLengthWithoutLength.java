package stringapi.level2;
import java.util.Scanner;

public class StringLengthWithoutLength {

    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int customLength = findLength(input);
        int builtInLength = input.length();
        System.out.println(customLength);
        System.out.println(builtInLength);
        sc.close();
    }
}
