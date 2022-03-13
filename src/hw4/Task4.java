package hw4;

//Задан одномерный массив целых чисел. Образуйте из него два отсортированных по возрастанию массива,
// содержащих четные и нечетные числа.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {59, 11, 2, 3, 4, 55, 6, 77, 88, 999};
        int indexEven = 0;
        int indexOdd = 0;
        int[] arrEven = new int[15];
        int[] arrOdd = new int[15];
        for (int item : arr) {
            if (item % 2 == 0) {
                arrEven[indexEven] = item;
                indexEven += 1;
            }
            if (item % 2 != 0) {
                arrOdd[indexOdd] = item;
                indexOdd += 1;
            }
        }
        Arrays.sort(arrEven);
        Arrays.sort(arrOdd);
        System.out.println(Arrays.toString(arrEven));
        System.out.println(Arrays.toString(arrOdd));
    }
}
