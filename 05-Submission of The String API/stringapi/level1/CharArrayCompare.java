package stringapi.level1;

import java.util.Scanner;

public class CharArrayCompare {

    // User-defined method to return characters of string
    static char[] getChars(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Compare two character arrays
    static boolean compareArrays(char[] a, char[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        char[] arr1 = getChars(text);

        // Built-in method
        char[] arr2 = text.toCharArray();

        // Compare results
        boolean result = compareArrays(arr1, arr2);

        // Display result
        System.out.println("\nCharacters using user-defined method:");
        for (char c : arr1)
            System.out.print(c + " ");

        System.out.println("\n\nCharacters using toCharArray():");
        for (char c : arr2)
            System.out.print(c + " ");

        System.out.println("\n\nAre both character arrays same? " + result);

        sc.close();
    }
}
