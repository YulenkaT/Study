package tasks;
// Создайте массив из двенадцати элементов с помощью генератора случайных чисел
// с элементами от –20 до 10 и выведите его на экран.
//  Замените все отрицательные элементы массива числом 0.
public class Task_3_4 {
    public static void main(String[] args) {
        int[] a = new int[12];
        int b = 0, c = 0;
        for (int m = 0; m < a.length; m++) {
            a[m] = (int) (Math.random() * 30) - 20;
            if (a[m] < 0) {
                b++;
            }
            if (a[m] < 0) {
                c++;
            }
            if (a[m] == 0) {
                --m;
            }
            if (m == a.length & b == a.length / 2) {
                b = 0;
                c = 0;
            }
            System.out.print(a[m] + " ");
        }
    }
}
