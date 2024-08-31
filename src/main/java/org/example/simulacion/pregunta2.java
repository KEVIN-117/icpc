package org.example.simulacion;

public class pregunta2 {
    public static void main(String[] args) {
        build(4,17,31,32);
    }
    static void build(int x0, int a, int c, int m){
        int x = x0;
        int i = 0;
        double r0 = (double) x /(m-1);
        System.out.println(i + " " + x + " " + r0);
        for ( i = 1; i <= m; i++) {
            x = (a * x + c) % m;
                double ri = (double) x /(m-1);
            System.out.println(i + " " + x + " " + ri);
        }
    }
}
