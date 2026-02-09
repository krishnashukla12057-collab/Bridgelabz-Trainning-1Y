package stringapi.level3;

import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String s1, String s2) {

        int len1 = 0, len2 = 0;

        try {
            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        try {
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        if (len1 != len2) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < len1; i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);

        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}
