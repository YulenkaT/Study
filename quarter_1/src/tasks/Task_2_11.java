package tasks;
//  Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

import java.util.Scanner;

public class Task_2_11 {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число");
        int m = 0;
        Scanner n = new Scanner(System.in);
        if(n.hasNextInt()) {
            m = n.nextInt();
        } else System.out.println("Введено неверное значение");
        for (int c=1; c<m; c++) {
            int r = m%c;
            if (r == 0) {
                System.out.println(c + " ");
            }
        }
    }
}
