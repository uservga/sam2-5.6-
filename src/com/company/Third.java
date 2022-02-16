package com.company;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        double a = scanner.nextDouble();
        System.out.println("Округлене числ: "+Math.round(a));
    }
}
