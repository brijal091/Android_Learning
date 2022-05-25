package com.example.javarefresher;

public class Func {
    public static double add(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        double sum = add(a,b);
        System.out.println(sum);
//        Using another file class here
        NClass obj = new NClass();
        obj.method1();
    }
}
