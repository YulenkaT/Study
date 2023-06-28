package tasks;

//Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное
// в переменную n, чётным либо нечётным.

public class EvenOdd {
    public static void main(String[] args) {
        int n = 3;
        if (n%2 == 0) System.out.println("n " + "четное число");
        else System.out.println("n " + "нечетное число");
    }
}
