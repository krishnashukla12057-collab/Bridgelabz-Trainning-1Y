package stringapi.level1;

import java.util.Scanner;

public class SubstringCompare {

    // Create substring using charAt()
    static String createSubstring(String str, int start, int end) {
        String sub = "";

        for (int i = start; i < end; i++) {
            sub = sub + str.charAt(i);
        }

        return sub;
    }

    // Compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter the string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Substring using charAt()
        String sub1 = createSubstring(text, start, end);

        // Substring using built-in method
        String sub2 = text.substring(start, end);

        // Compare both substrings
        boolean result = compareStrings(sub1, sub2);

        // Output
        System.out.println("\nSubstring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);

        if (result)
            System.out.println("Both substrings are SAME");
        else
            System.out.println("Both substrings are DIFFERENT");

        sc.close();
    }
}

