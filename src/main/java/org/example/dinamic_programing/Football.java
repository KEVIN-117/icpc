package org.example.dinamic_programing;

public class Football {
    static int football(int k){
        if (k <= 0)
            return 0;
        if (k == 1)
            return 1;

        return football(k - 1) + football(k - 2);
    }

    public static void main(String[] args) {
        System.out.println(football(5));
    }
}
