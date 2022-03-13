package hw4;

//Задать массив. Отрицательные элементы массива перенести в новый массив.
// Размер массива должен быть равен количеству отрицательных элементов.

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] arr = {59, 11, -2, 3, 4, -55, 6, 77, -88, 999};
        int countNegativeNum = 0;
        int index = 0;

        for (int item : arr) {
            if (item < 0) {
                countNegativeNum += 1;
            }
        }
        int[] negativeArr = new int[countNegativeNum];
        for (int item : arr) {
            if (item < 0) {
                negativeArr[index] = item;
                index += 1;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(negativeArr));
    }

}
