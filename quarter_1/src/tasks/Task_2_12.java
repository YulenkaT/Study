package tasks;
//  Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым.

import java.util.Scanner;
public class Task_2_12 {
    public static void main(String[] args) {
        System.out.println("Введите любое значение натурального числа");
        int m = 0;
        boolean prime = true;
        Scanner n = new Scanner(System.in);
        if(n.hasNextInt()) {
            m = n.nextInt();
        } else System.out.print("Введено неверное значение");
        for (int c = 2; c <= Math.sqrt(m); c++) {
            int r = m % c;
            if (r == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.print(m + " простое число");
        } else {
            System.out.print(m + " составное число");
        }
    }
}