package tasks;
// Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.

import java.util.Random;

public class Random3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(899) + 100;
        int first = a / 100;
        int secondBegin = a / 10;
        int second = secondBegin % 10;
        int third = a % 10;
        if (first > second && first > third) {
            System.out.println (first);
        } else if (second > first && second > third) {
            System.out.println (second);
        } else {
            System.out.println (third);
        }
        System.out.println (a);
    }
}