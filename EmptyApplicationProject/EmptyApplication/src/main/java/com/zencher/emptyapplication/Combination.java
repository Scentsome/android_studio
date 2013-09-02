package com.zencher.emptyapplication;

import java.math.BigInteger;

/**
 * Created by chronoer on 13/9/1.
 */
public class Combination {
    public BigInteger chooseMFromN(int m, int n){
        BigInteger value1 = this.fractorial(n);
        BigInteger value2 = this.fractorial(m);
        BigInteger value3 = this.fractorial(n-m);
        return value1.divide(value2).divide(value3);
    }
    public BigInteger fractorial(int max){
        BigInteger result = new BigInteger("1");
        for (int n = 1 ; n <= max ; n++){
            result = result.multiply(new BigInteger(String.valueOf(n)));

        }
        return result;
    }
}

