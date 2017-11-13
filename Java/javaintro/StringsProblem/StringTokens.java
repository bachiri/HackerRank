package javaintro.StringsProblem;


import java.util.Arrays;


import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/java-string-tokens/problem
 * <p>
 * Difficulty: Easy
 * Author : Bachiri Taoufiq Abderrahman
 */
public class StringTokens {

    public final static String EMPTY = "0";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (!s.isEmpty() && !s.trim().isEmpty())
            printTokens(s);
        else
            System.out.println(EMPTY);

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
