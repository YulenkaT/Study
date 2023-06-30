package tasks;
// Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
public class Task_2_9 {
    public static void main(String[] args) {
        for (int i = 0, a = 2; i < 20; a=a*2, i++) {
            System.out.print(a + " ");
        }
    }
}
