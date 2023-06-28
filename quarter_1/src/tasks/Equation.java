package tasks;
//
import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();
        double x = -b / a;
        System.out.println("x= " + x);
    }
}