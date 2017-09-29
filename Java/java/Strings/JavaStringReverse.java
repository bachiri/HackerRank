package java.Strings;

import java.io.*;
import java.time.Year;
import java.util.*;

//https://www.hackerrank.com/challenges/java-string-reverse/problem

public class JavaStringReverse {

    static final String YES = "Yes";
    static final String NO = "No";

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(isApalidrom(A));


    }

    private static String isApalidrom(String a) {

        char[] b = a.toCharArray();
        String returnVal = YES;

        for (int i = 0; i < a.length() / 2; i++) {
            if (b[i] != b[(a.length() - 1) - i])
                returnVal = NO;
        }
        return returnVal;
    }


}
