package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }

        System.out.println("Greatest common factor: " + a);
    }
}
