package com.company;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int a = scanner.nextInt();
        System.out.print("Введіть число: ");
        int b = scanner.nextInt();
        System.out.println("Pезультат ділення: "+a/b);
        System.out.println("Pезультат залишку від ділення: "+a%b);
    }
}
