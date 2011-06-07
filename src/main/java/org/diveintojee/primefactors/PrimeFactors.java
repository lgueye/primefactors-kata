package org.diveintojee.primefactors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author louis.gueye@gmail.com
 */
public class PrimeFactors {

    /**
     * @param n
     * @return
     */
    public static List<Integer> generate(int n) {

        final List<Integer> primes = new ArrayList<Integer>();

        int factor = 2;

        while (n > 1) {

            while (n % factor == 0) {
                primes.add(factor);
                n /= factor;
            }

            factor++;

        }
        return primes;
    }

}
