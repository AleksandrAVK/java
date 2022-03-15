package hw4;

//Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
// Определите какой элемент встречается в массиве чаще всего и выведите информацию об этом в консоль.
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arrRandom1 = {-1, 0, 1, -1, 0, 1, -1, 0, 1, 0, 1,}; //  в консоли пусто
        int[] arrRandom2 = {-1, 0, 1, -1, 0, 1, -1, 0, 1, 1, 1,}; // в консоли 1
        System.out.println(Arrays.toString(arrRandom2));
        int positiveNum = 0;
        int negativeNum = 0;
        int zero = 0;
        for (int item : arrRandom1) {
            if (item > 0) positiveNum += 1;
            if (item < 0) negativeNum += 1;
            if (item == 0) zero += 1;
//            System.out.println("positiveNum___" + positiveNum+ "___zero---"+zero+"");
        }

        if (positiveNum > negativeNum && positiveNum > zero) {
            System.out.println("Чаще всего встречается положительное число в количестве " + positiveNum + " раз");
        } else if (negativeNum > positiveNum && negativeNum > zero) {
            System.out.println("Чаще всего встречается негативное число в количестве " + negativeNum + " раз");
        } else if (zero > positiveNum && zero > negativeNum) {
            System.out.println("Чаще всего встречается ноль число в количестве " + zero + " раз");
        }
    }
}
