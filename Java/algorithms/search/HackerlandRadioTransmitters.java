package algorithms.search;

import java.util.*;


/**
 * Problem Link : https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
 * <p>
 * Difficulty: Medium
 * Author : Bachiri Taoufiq Abderrahman
 */
public class HackerlandRadioTransmitters {

    public static void main(String[] args) {

        //Input
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        List<Integer> houses_x = new ArrayList<>();

        for (int x_i = 0; x_i < n; x_i++) {
            houses_x.add(in.nextInt());
        }

        //Set up Required Variables
        Collections.sort(houses_x);

        int requiredTransmitter = 0;
        int i = 0;
        while (i < n) {

            requiredTransmitter++;
            int transmitterLocalisation = houses_x.get(i) + k;

            leftOfTransmitter:
            for (; i < n; i++) {
                if (houses_x.get(i) > transmitterLocalisation)
                    break leftOfTransmitter;
            }

            transmitterLocalisation = houses_x.get(--i) + k;

            rightOfTransmitter:
            for (; i < n; i++) {
                if (houses_x.get(i) > transmitterLocalisation)
                    break rightOfTransmitter;
            }


        }

        System.out.println(requiredTransmitter);
    }
}
