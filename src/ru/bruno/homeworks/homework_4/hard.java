package ru.bruno.homeworks.homework_4;

//
//Создайте массив из 10 случайных целых чисел из отрезка [0;100).
//        Отсортируйте данный массив и выведите результат в консоль.
//        Например, имеется следующий массив: 45, 37, 79, 45.
//        Отсортированный массив: 37, 45, 45, 79.


import java.util.Arrays;
import java.util.Random;

public class hard {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber;
        int[] arrayWithOutSort = new int[10];
        int index = 0;
        for (int i = 0; i < arrayWithOutSort.length; i++) {
            randomNumber = random.nextInt(101);
            arrayWithOutSort[i] = randomNumber;
        }
        System.out.print("Исходный массив без сортировки  = " + Arrays.toString(arrayWithOutSort) + "\n");
        for(int i = 0; i< arrayWithOutSort.length; i++)
        {
            int minimum = arrayWithOutSort[i];
            int minimum_index = i;
            for(int j = i + 1; j< arrayWithOutSort.length ; j++) {
                if(arrayWithOutSort[j] < minimum) {
                    minimum = arrayWithOutSort[j];
                    minimum_index = j;
                }

            }
            if(minimum_index != i)
            {
                int temp = arrayWithOutSort[i];
                arrayWithOutSort[i] = arrayWithOutSort[minimum_index];
                arrayWithOutSort[minimum_index] = temp;
            }

        }


        System.out.print("Сортированный массив  = " + Arrays.toString(arrayWithOutSort) + "\n");

    }







}
