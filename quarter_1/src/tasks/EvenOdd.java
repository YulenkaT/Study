package tasks;

import java.util.Scanner;

//Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное
// в переменную n, чётным либо нечётным.

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        double n = scanner.nextDouble();
        if (n%2 == 0) System.out.println(" n " + "четное число");
        else System.out.println(" n " + "нечетное число");
    }
}
