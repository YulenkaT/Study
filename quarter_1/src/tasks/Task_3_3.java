package tasks;
//Создайте массив из восьми элементов с помощью генератора случайных чисел с элементами от –10 до 10
// и выведите его на экран.
// Подсчитайте количество отрицательных элементов массива.

public class Task_3_3 {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
        array[i] = (int) Math.round((Math.random() * 21) - 10);
        System.out.println(array[i]);
    }
    }
}