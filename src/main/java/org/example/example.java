package org.example;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        while (n > 0){
            System.out.println(solution(x.nextInt()));
            n--;
        }
    }

    public static String solution(int number){
        int saveNumber = number;
        int res = 0;
        while (number != 0){
            int aux = number % 10;
            res += fact(aux);
            number /= 10;

        }
        return saveNumber == res? "Y": "N";
    }


    public static int fact(int n){
        if (n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
}
