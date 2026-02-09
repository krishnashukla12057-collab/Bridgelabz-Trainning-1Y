package stringapi.level2;
import java.util.Scanner;

public class TrimWithoutTrim {

    static int[] findTrimIndex(String str) {
        int start = 0;
        int end = 0;

        try {
            while (str.charAt(start) == ' ') {
                start++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        try {
            int i = 0;
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            end = e.getMessage() == null ? 0 : 0;
        }

        int last = 0;
        try {
            while (true) {
                str.charAt(last);
                last++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            last = last - 1;
        }

        end = last;
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {

        int i = 0;
        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            try {
                s2.charAt(i);
                return false;
            } catch (StringIndexOutOfBoundsException ex) {
                return true;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] index = findTrimIndex(text);
        String customTrim = createSubstring(text, index[0], index[1]);
        String builtInTrim = text.trim();

        boolean result = compareStrings(customTrim, builtInTrim);

        System.out.println(customTrim);
        System.out.println(builtInTrim);
        System.out.println(result);

        sc.close();
    }
}

