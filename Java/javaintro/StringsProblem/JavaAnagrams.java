package javaintro.StringsProblem;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


/**
 * Problem Link :https://www.hackerrank.com/challenges/java-anagrams/problem
 * <p>
 * Difficulty: Easy
 * Author : Bachiri Taoufiq Abderrahman
 */

public class JavaAnagrams {

    public static boolean isAnagram(String a, String b) {

        //Our Algorithm is case Insensitive
        a = a.toLowerCase();
        b = b.toLowerCase();

        boolean isAnagram = false;

        if (a.length() != b.length())
            isAnagram = false;

        Map<Character, Integer> mapA = BuildMap(a);
        Map<Character, Integer> mapB = BuildMap(b);

        if (mapA.equals(mapB))
            isAnagram = true;

        return isAnagram;

    }

    //O(n)
    public static Map<Character, Integer> BuildMap(String a) {
        Map<Character, Integer> returnMap = new TreeMap<>();
        for (int i = 0; i < a.length(); i++) {
            final char key = a.charAt(i);
            if (returnMap.containsKey(key)) {
                final Integer integer = returnMap.get(key);
                returnMap.put(key, (integer.intValue() + 1));
            } else returnMap.put(key, 1);

        }
        return returnMap;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
