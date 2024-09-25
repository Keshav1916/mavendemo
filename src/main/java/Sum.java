package com.sum.app;

public class Sum {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int result = sum.add(50, 50);
        System.out.println("The sum of " + 50 + " and " + 50 + " is: " + result);
    }
}
