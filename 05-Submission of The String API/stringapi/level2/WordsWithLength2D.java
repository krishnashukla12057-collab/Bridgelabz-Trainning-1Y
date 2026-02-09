package stringapi.level2;

import java.util.Scanner;

public class WordsWithLength2D {

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
        int spaceCount = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] index = new int[spaceCount + 2];
        index[0] = -1;

        int k = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                index[k++] = i;
            }
        }
        index[k] = len;

        String[] words = new String[spaceCount + 1];

        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = index[i] + 1; j < index[i + 1]; j++) {
                temp = temp + text.charAt(j);
            }
            words[i] = temp;
        }

        return words;
    }

    static String[][] create2DArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = create2DArray(words);

        for (int i = 0; i < data.length; i++) {
            int length = Integer.parseInt(data[i][1]);
            System.out.println(data[i][0] + "\t" + length);
        }

        sc.close();
    }
}
