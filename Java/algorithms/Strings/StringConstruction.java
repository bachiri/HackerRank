package algorithms.Strings;

import java.util.Scanner;

/**
 * Problem Link : https://www.hackerrank.com/challenges/making-candies/problem
 * <p>
 * Difficulty: Hard
 * Author : Bachiri Taoufiq Abderrahman
 */
public class StringConstruction {

    static long minimumPasses(long m, long w, long p, long n) {
        long passes = 1;
        long candiesBank = m * w;

        if (candiesBank >= n) {
            return passes;
        }

        while (candiesBank <= n) {


        }

        return passes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long numberOfMachines = in.nextLong();
        long numberOfWorkers = in.nextLong();
        long price = in.nextLong();
        long requiredCandiesToProduce = in.nextLong();
        long result = minimumPasses(numberOfMachines, numberOfWorkers, price, requiredCandiesToProduce);
        System.out.println(result);
        in.close();
    }
}
