package javaintro.StringsProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


/**
 * https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 * <p>
 * Difficulty: Easy
 * Author : Bachiri Taoufiq Abderrahman
 */
public class PatternSyntaxChecker {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            int testCases = Integer.parseInt(in.nextLine());
            List<String> patternStateList = new ArrayList<>();

            for (int i = 0; i < testCases; i++) {
                String validState = "Valid";
                String patternString = in.nextLine();
                try {
                    Pattern pattern = Pattern.compile(patternString);
                } catch (PatternSyntaxException e) {
                    validState = "Invalid";
                }
                patternStateList.add(validState);
            }
            for (String state : patternStateList) {
                System.out.println(state);

            }
        }


    }
}

