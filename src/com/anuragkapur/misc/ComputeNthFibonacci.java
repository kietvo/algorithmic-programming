package com.anuragkapur.misc;

/**
 * @author: anuragkapur
 * @since: 26/05/2014
 */

public class ComputeNthFibonacci {
    // assume first element 0, i.e. fibonacci series: 0 1 1 2 3 5 8 13 21 ...
    public static int compute(int n) {

        if(n == 1)
            return 0;
        if(n == 2)
            return 1;
        else
            return compute(n-1) + compute(n-2);
    }
}
