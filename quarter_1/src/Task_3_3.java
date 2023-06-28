
//Создайте массив из восьми элементов с помощью генератора случайных чисел с элементами от –10 до 10
// и выведите его на экран.
// Подсчитайте количество отрицательных элементов массива.

public class Task_3_3 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int b = 0, c = 0;
        for (int m = 0; m < a.length; m++) {
            a[m] = (int) (Math.random() * 21) - 10;
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
