package org.example.simulacion;

import java.util.ArrayList;

public class Pregunta3 {

    static void build(int x0, int a, int b, int c, int m){
        int x = x0;
        int i = 0;
        double r0 = (double) x /(m-1);
        System.out.println(i + " " + x + " " + r0);
        for ( i = 1; i <= m; i++) {
            x = getXi(x, a, b, c, m);
            double ri = (double) x /(m-1);
            System.out.println(i + " " + x + " " + ri);
        }
    }

    static int getXi(int x, int a, int b, int c, int m){
        return (int) (((a * Math.pow(x, 2)) + (b * x) + c) % m);
    }

    public static void main(String[] args) {
        //build(38,20,48,85,32);
        //conguencialLineal(67, 7, 68, 66, 66);
        //congruencialMuiltplicativo(131, 37, 32, 32);
        algoritmoCongruencialCuadratico(166, 227, 29, 32, 128);
    }

    public static void conguencialLineal(int x0, int a, int c, int m, int n){
        int x = (a * x0 + c) % m;
        String operacion = String.format("%d * %d + %d mod %d = %d", a, x0, c, m, x);
        System.out.println(operacion);
        System.out.println("------------------------------------------------");
        ArrayList<Double> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int aux = x;
            x = (a * x + c) % m;
            double ri = (double) x /(m-1);
            operacion = String.format("%d * %d + %d mod %d = %d", a, aux, c, m, x);
            String resultado = String.format("%d / %d = %f", x, m-1, ri);
            results.add(ri);
            System.out.println(operacion + " \t\t " + resultado);

        }
    }

    public static void congruencialMuiltplicativo(int x0, int a, int m, int n){
        int x = (a * x0) % m;
        String operacion = String.format("%d * %d mod %d = %d", a, x0, m, x);
        System.out.println(operacion);
        System.out.println("------------------------------------------------");
        for (int i = 0; i < n; i++) {
            int aux = x;
            x = (a * x) % m;
            double ri = (double) x /(m-1);
            operacion = String.format("%d * %d mod %d = %d", a, aux, m, x);
            String resultado = String.format("%d / %d = %f", x, m-1, ri);
            System.out.println(operacion + " \t\t " + resultado);

        }
    }
    public static void algoritmoCongruencialCuadratico(int a, int b, int c, int x0, int m){
        int x = x0;
        int i = 0;
        double r0 = (double) x /(m-1);
        System.out.println(i + " " + x + " " + r0);
        for ( i = 1; i <= m; i++) {
            x = getXi(x, a, b, c, m);
            double ri = (double) x /(m-1);
            System.out.println(i + " " + x + " " + ri);
        }
    }
}
