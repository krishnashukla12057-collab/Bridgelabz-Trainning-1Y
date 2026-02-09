package stringapi.level1;

import java.util.Scanner;

public class StringCompare {

    // Compare strings using charAt()
    static boolean compareStrings(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean result1 = compareStrings(s1, s2); // charAt()
        boolean result2 = s1.equals(s2);           // equals()

        System.out.println("charAt() result: " + result1);
        System.out.println("equals() result: " + result2);

        if (result1 == result2)
            System.out.println("Both results are same");

        sc.close();
    }
}
