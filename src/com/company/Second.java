package com.company;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int a = scanner.nextInt();
        int b = a%10;
        double c = Math.floor(a/10);
        System.out.println("Сумма цифр числа " +a +" = "+Math.round(b+c));
    }
}
