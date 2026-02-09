package stringapi.level2;
import java.util.Scanner;

public class SplitAndCompare {

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

    static String[] customSplit(String text) {

        int len = findLength(text);
        int spaceCount = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndex = new int[spaceCount + 2];
        spaceIndex[0] = -1;

        int k = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[k++] = i;
            }
        }
        spaceIndex[k] = len;

        String[] words = new String[spaceCount + 1];

        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                temp = temp + text.charAt(j);
            }
            words[i] = temp;
        }

        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] builtInSplit = text.split(" ");
        String[] customSplit = customSplit(text);

        boolean result = compareArrays(builtInSplit, customSplit);

        System.out.println(result);

        sc.close();
    }
}

