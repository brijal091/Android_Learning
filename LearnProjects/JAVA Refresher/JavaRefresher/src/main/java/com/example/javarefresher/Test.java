package com.example.javarefresher;

public class Test {
    public void method1(){
        System.out.println("I am Parent class");
    }
    public static void main(String[] args) {
        child chotaobj = new child();
        chotaobj.childMethod();
        chotaobj.method1();
    }
}

