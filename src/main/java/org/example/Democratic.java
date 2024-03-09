package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Democratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = scanner.next().substring(0, m);
        }

        for (int i = 0; i < n; i++) {

        }
    }

}
