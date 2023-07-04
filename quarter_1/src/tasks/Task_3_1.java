package tasks;
//  Создайте массив из пяти чисел и выведите их на экран в обратном порядке.

import java.util.Arrays;

public class Task_3_1 {
        // Utility method to reverse elements of an array
        public static void reverse(int[] nums)
        {
                int[] a = new int[nums.length];

                for (int i = 0; i < nums.length; i++) {
                        a [nums.length - 1 - i] = nums[i];
                }

                for (int i = 0; i < nums.length; i++) {
                        nums[i] = a [i];
                }
        }

        public static void main(String[] args)
        {
                int[] nums = {1, 2, 3, 4, 5};
                reverse(nums);
                System.out.println(Arrays.toString(nums));
        }
}