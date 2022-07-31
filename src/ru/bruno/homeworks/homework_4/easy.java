package ru.bruno.homeworks.homework_4;

import java.util.Arrays;
import java.util.Random;
//
//Создайте массив из 12 случайных целых чисел из отрезка [0;30].
// Определите какой элемент является в этом массиве максимальным и выведите в консоль его индекс.

public class easy {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber;
        int [] array = new int[12];
        int minimumNumber = 0;
        int index = 0;
        for(int i = 0; i< 12 ; i++)
        {
            randomNumber = random.nextInt(31);
            array[i] = randomNumber;
            if(randomNumber > minimumNumber )
            {
                minimumNumber = randomNumber;
                index = i;
            }

        }
        System.out.print("Исходный массив  = " + Arrays.toString(array) + "\n");
        System.out.println("Индекс максимального числа  = " + index + "\n");

    }
}
