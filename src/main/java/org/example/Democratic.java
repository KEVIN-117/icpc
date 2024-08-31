package org.example;

import java.util.*;

public class Democratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }
        String winnerName = getCountyName(n, m, names);
        System.out.println(winnerName);
    }
    public static String getCountyName(int n, int m, String[] cityNames) {
        StringBuilder countyName = new StringBuilder();
        for (int i = 0; i < m; i++) {
            Map<Character, Integer> letterCounts = new HashMap<>();
            for (String city : cityNames) {
                char letter = city.charAt(i);
                letterCounts.put(letter, letterCounts.getOrDefault(letter, 0) + 1);
            }
            char mostCommonLetter = 'a';
            int maxCount = 0;
            for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
                if (entry.getValue() > maxCount || (entry.getValue() == maxCount && entry.getKey() < mostCommonLetter)) {
                    mostCommonLetter = entry.getKey();
                    maxCount = entry.getValue();
                }
            }
            countyName.append(mostCommonLetter);
        }
        return countyName.toString();
    }

}
