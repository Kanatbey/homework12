package com.company;

public class Uchburchtuk {
    double a;
    double b;
    double c;

    public void area() {
        System.out.println(Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c))));
    }
}
