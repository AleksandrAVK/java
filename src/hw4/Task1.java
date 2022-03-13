package hw4;

//Заполните массив на N элементов случайным целыми числами и выведете максимальное, минимальное и среднее значение

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {59, 11, 2, 3, 4, 55, 6, 77, 888, 999};
        int maxNum = arr[0];
        int minNum = arr[0];
        double intermediateNum = arr[0];

        for (int item : arr) {
            if (item > maxNum) maxNum = item;
            if (item < minNum) minNum = item;
        }
        intermediateNum = (double) (maxNum + minNum) / 2;
        System.out.println("maxNum -->" + maxNum);
        System.out.println("minNum -->" + minNum);
        System.out.println("intermediateNum -->" + intermediateNum);
    }
}
