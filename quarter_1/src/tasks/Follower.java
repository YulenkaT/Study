package tasks;
// В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
// Создать программу, которая переставит числа в переменных таким образом,
//  чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
public class Follower {
    public static void main(String args []) {
        int a = 7;
        int b = 0;
        int c = -5;
        int x;
        if (a > b) {
            x = a;
            a = b;
            b = x;
        }
        if (b > c) {
            x = b;
            b = c;
            c = x;
        }
        if (a > b) {
            x = a;
            a = b;
            b = x;
        }
        System.out.println("Возрастающая последовательность: " + a  + " " + b + " " + c);
    }
}