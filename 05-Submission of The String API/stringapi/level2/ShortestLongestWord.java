package stringapi.level2;
import java.util.Scanner;

public class ShortestLongestWord {

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

    static String[] splitWords(String text) {

        int len = findLength(text);
        int spaces = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }

        int[] index = new int[spaces + 2];
        index[0] = -1;

        int k = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                index[k++] = i;
            }
        }
        index[k] = len;

        String[] words = new String[spaces + 1];

        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = index[i] + 1; j < index[i + 1]; j++) {
                temp = temp + text.charAt(j);
            }
            words[i] = temp;
        }

        return words;
    }

    static String[][] wordLength2D(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    static int[] findShortestLongest(String[][] data) {

        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
            }
            if (len > max) {
                max = len;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = wordLength2D(words);
        int[] result = findShortestLongest(data);

        System.out.println("Shortest Length: " + result[0]);
        System.out.println("Longest Length: " + result[1]);

        sc.close();
    }
}
