package ru.bruno.homeworks.homework_4;

//Создайте массив из 10 случайных целых чисел из отрезка [20;100).
//        Выведите в консоль содержимое массива, чтобы пользователь ввел с клавиатуры число из этого массива.
//        Выведите в консоль индекс элемента, который ввел пользователь, в массиве.
//        Если пользователь ввел число, которого нету в массиве, то выведите ошибку.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class normal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput;
        Random random = new Random();
        int randomNumber;
        int[] array = new int[12];
        int minimumNumber = 0;
        int index = -1;
        for (int i = 0; i < 11; i++) {
            randomNumber = random.nextInt(81) + 20;
            array[i] = randomNumber;
        }

        while (index == -1) {
            System.out.print("Исходный массив  = " + Arrays.toString(array) + "\n");
            System.out.println("Введите число из массива");
            userInput = scanner.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == userInput) {
                    index = i;
                    System.out.println("Индекс выбранного числа  = " + index + "\n");
                }
            }
            if (index == -1) System.out.println("Вы ввели неверное число");
        }

    }


}
