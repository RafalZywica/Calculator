package com.kodilla;

public class Calculator {
    private int a;
    private int b;
    public Calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int addBToA() {
        return a + b;
    }
    public int subtractBFromA() {
        return a - b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    public static void main(String[] args){
        Calculator example1 = new Calculator(6,4);
        System.out.println("Wynik dodawania a (" + example1.getA() + ") oraz b (" + example1.getB() + ") to: " + example1.addBToA());
        System.out.println("Wynik odejmowania b (" + example1.getB() + ") od a (" + example1.getA() + ") to: " + example1.subtractBFromA());
    }
}

