package tasks;
// Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class Task_2_7 {
    public static void main(String[] args) {
        for (int i = 0,
             a = 1;
             i < 55;
             a=a+2, i++) {
            System.out.print(a + " ");
        }
    }
}
