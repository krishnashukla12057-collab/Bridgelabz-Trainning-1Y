package stringapi.level2;
import java.util.Scanner;

public class VowelConsonantCount {

    static int checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

    static int[] countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = str.charAt(i);
                int result = checkChar(ch);

                if (result == 1) {
                    vowels++;
                } else if (result == 2) {
                    consonants++;
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] result = countVowelsConsonants(text);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        sc.close();
    }
}
