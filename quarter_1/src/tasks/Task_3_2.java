package tasks;
// Создайте массив из семи элементов с помощью генератора случайных чисел и выведите его на экран.
//  Увеличьте все его элементы в 2 раза.
import java.util.Arrays;
import java.util.Random;

public class Task_3_2 {
        public static void main(String[] args) {
            int length = 7; // длина массива
            int[] nums = new int[length];

            Random random = new Random(); // создаем объект класса Random

            for (int i = 0; i < length; i++) {
                // заполняем каждый элемент случайным числом от 0 до 99
                nums[i] = random.nextInt(100);
    }
            // выводим массив на экран
            System.out.println(Arrays.toString(nums));
        }
    }