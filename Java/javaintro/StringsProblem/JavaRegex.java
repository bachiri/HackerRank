package javaintro.StringsProblem;


import java.util.Scanner;

/**
 * Problem Link :https://www.hackerrank.com/challenges/java-regex/problem
 * <p>
 * Difficulty: Medium
 * Author : Bachiri Taoufiq Abderrahman
 */
public class JavaRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }


    private static class MyRegex {


        public final String pattern =
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    }
}
