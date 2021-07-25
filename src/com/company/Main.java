package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podac parametr a: ");
        a = scanner.nextDouble();
        double b;
        System.out.println("Prosze podac parametr b : ");
        b = scanner.nextDouble();
        double c;
        System.out.println("Prosze podac parametr c :");
        c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        double deltaSqrt = Math.sqrt(delta);
        System.out.println("Delta wynosi :" + delta);
        if (delta > 0) {
            double x1 = (-b + deltaSqrt) / (2 * a);
            double x2 = (-b - deltaSqrt) / (2 * a);
            System.out.println("Rozwiazanie X1 wynosi: " + x1 + "oraz X2 " + x2);
        } else if (delta == 0) {
            System.out.println("Funkcja ma jedno rozwizanie X1= " + -b / 2 * a);
        } else {
            System.out.println("Funkcja nie ma rozwizań ");
        }


    }


}
