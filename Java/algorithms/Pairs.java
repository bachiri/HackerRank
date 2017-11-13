package algorithms;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Problem Link :https://www.hackerrank.com/challenges/pairs/problem
 * <p>
 * Difficulty: Medium
 * Author : Bachiri Taoufiq Abderrahman
 */
public class Pairs {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //Inputs
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            integers.add(scanner.nextInt());
        }

        //In order to use the binary search the list should be sorted
        Collections.sort(integers);

        final long count = integers.stream().filter(integer -> Collections.binarySearch(integers, integer - k) >= 0).count();
        System.out.println(count);
    }
}
