package javaintro.StringsProblem;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/java-string-tokens/problem
 * <p>
 * Difficulty: Easy
 */
public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (!s.isEmpty() && !s.trim().isEmpty())
            printTokens(s);
        else
            System.out.println("0");

        scan.close();
    }

    private static void printTokens(String s) {
        final String[] splitString = s.trim().split("[ .,?!'@_]+");
        System.out.println(splitString.length);
        Arrays.asList(splitString)
                .stream()
                .forEach(System.out::println);


    }
}
