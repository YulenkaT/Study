package tasks;
// Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
import java.util.Scanner;

public class Task_2_10 {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите число для вычисления факториала");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            int y = 1;
            for (int i = 1; i <= a; i++) {
                y = y * i;
            }
            System.out.print(a + "!=");
            System.out.print(y);
        }
    }
}
