package org.example;

import java.util.Scanner;

public class Battle {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            float n = cin.nextInt();
            int cont = 0;
            while(n>0){
                if (n>1) {
                    n = n/2;
                    cont ++;
                }else{
                    n = n - 1;
                    cont ++;
                }
            }
            System.out.println(cont);
        }
    }

}
