package org.example;

public class CountNoOfOddDigitInNumber {

    /*
     You are given an integer n. You need to return the number of odd digits present in the number.
     The number will have no leading zeroes, except when the number is 0 itself.

      Input: n = 5
      Output: 1
      Explanation: 5 is an odd digit
      */
    public int countOddDigit(int n) {
        int cnt = 0;
        if(n==0){
            return 0;
        }
        while(n>0){
            int lastDigit = n % 10;
            if(lastDigit % 2 != 0){
                cnt = cnt+1;
            }
            n = n / 10;
        }
        return cnt;
    }

    /*
    * Time Complexity - O(n)
    * Space Complexity - O(1)
    * */
}
