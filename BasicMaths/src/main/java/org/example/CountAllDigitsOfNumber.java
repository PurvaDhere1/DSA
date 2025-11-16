package org.example;

public class CountAllDigitsOfNumber {
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
}
