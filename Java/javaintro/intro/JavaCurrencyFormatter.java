package javaintro.intro;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Problem Link :https://www.hackerrank.com/challenges/java-currency-formatter/problem
 * <p>
 * Difficulty: Easy
 * Author : Bachiri Taoufiq Abderrahman
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Double price = scanner.nextDouble();

            //Known Locales
            Locale fr = Locale.FRANCE;
            Locale us = Locale.US;
            Locale china = Locale.CHINA;

            //Customized Currency formatter
            DecimalFormat india = (DecimalFormat) NumberFormat.getCurrencyInstance(us);
            DecimalFormatSymbols dfs = new DecimalFormatSymbols();
            dfs.setCurrencySymbol("Rs.");
            india.setDecimalFormatSymbols(dfs);

            System.out.println("US: " + NumberFormat.getCurrencyInstance(us).format(price));
            System.out.println("India: " + india.format(price));
            System.out.println("China: " + NumberFormat.getCurrencyInstance(china).format(price));
            System.out.println("France: " + NumberFormat.getCurrencyInstance(fr).format(price));
        }


    }
}
