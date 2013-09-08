package com.zencher.helloapp;

import java.math.BigInteger;

public class Combination {
    public Combination() {
    }

    BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");
        for (int number = 1; number <= n; number++) {
            result = result.multiply(new BigInteger(Integer.valueOf(number).toString())) ;
        }
        return result;
    }
    public int chooseRFromN(int r, int n){
        BigInteger value1 = this.factorial(n);
        BigInteger value2 = this.factorial(r);
        BigInteger value3 = this.factorial(n-r);
        return value1.divide(value2).divide(value3).intValue();
    }
}