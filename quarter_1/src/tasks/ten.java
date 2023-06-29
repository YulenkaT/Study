package tasks;
// Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//  Например, среди чисел 8 и 11 ближайшим к десяти будет 11.
public class ten {
    public static void main(String[] args) {
        int m = 8;
        int n = 11;
        int a = 10;
        int b1 = a - m;
        int b2 = a - n;
        if (b1 > b2) {
            System.out.println(n);
        } else {
            System.out.println(m);
        }
    }
}
