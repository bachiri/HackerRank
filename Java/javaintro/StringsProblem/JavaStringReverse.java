package javaintro.StringsProblem;

import java.util.*;


/**
 * https://www.hackerrank.com/challenges/java-string-reverse/problem
 * <p>
 * Difficulty: Easy
 */
public class JavaStringReverse {

    static final String YES = "Yes";
    static final String NO = "No";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(isPalindrome(A));

    }

    private static String isPalindrome(String word) {

        char[] wordToCharArray = word.toCharArray();
        String returnVal = YES;

        for (int i = 0; i < word.length() / 2; i++) {
            if (wordToCharArray[i] != wordToCharArray[(word.length() - 1) - i])
                returnVal = NO;
        }
        return returnVal;
    }


}
