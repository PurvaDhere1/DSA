package org.example;

public class CountAllDigitsOfNumber {
    // 1st way to solve the problem
    static int countAllDigitsOfNumber(int num){
        int cnt = 0;
        if(num == 0){
            return 1;
        }
        while (num>0){
            cnt = cnt+1;
            num = num/10;

        }
        System.out.println(cnt);
        return cnt;
    }

    /*Time Complexity = O(num) - this will run a while loop until num
    Space Complexity = O(1) -- no external memory is being used   */

/*    2nd way of to solve the problem
    by using formula log10(num)^2 + 1*/
}
