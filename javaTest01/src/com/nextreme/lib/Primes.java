package com.nextreme.lib;

/**
 * Created by huazhang on 10/26/15.
 */
public class Primes {
    static int [] knownPrimes = new int[4];

    // static initialize block
    static {
        knownPrimes[0] = 2;
        for( int i=1; i<knownPrimes.length; ++i ) {
            knownPrimes[i] = nextPrime();
        }
    }

    static int nextPrime() {
        return 0;
    }
}
