package org.example.two_pointers;

import java.util.Arrays;
import java.util.Scanner;

public class CF_SerejaDima {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }

        solution(arr, n);
    }

    static void solution(int[] arr, int n) {
        int player1 = 0;
        int player2 = 0;
        int left = 0;
        int right = arr.length - 1;
        boolean player1Turn = true;

        while (left <= right) {
            if (arr[left] > arr[right]) {
                if (player1Turn) {
                    player1 += arr[left];
                } else {
                    player2 += arr[left];
                }
                left++;
            } else {
                if (player1Turn) {
                    player1 += arr[right];
                } else {
                    player2 += arr[right];
                }
                right--;
            }

            player1Turn = !player1Turn;
        }
        System.out.println(player1 + " " + player2);
    }
}