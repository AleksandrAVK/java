package hw3;

//Программа загадывает число в диапазоне [1;9]
//        Пользователь вводит число с клавиатуры
//        Программа в зависимости от введенного числа выводит в консоль следующее:
//        "загаданное число больше"
//        "загаданное число меньше"
//        "Вы угадали" (программа завершает работу)
//        Если введен 0, выввести "выход из программы" (программа завершает работу)

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите любое чиcло и нажмите enter");
        int randomNumber = (int) (1 + Math.random() * 9); //[0;9)
        int userNum = 0;
        Scanner scanner = new Scanner(System.in);
        userNum = scanner.nextInt();

        while (userNum > 0) {
            System.out.println("Введите целое число"+"  " + "или ноль для выхода из программы");
            userNum = scanner.nextInt();
            System.out.println("randomNumber ---> "+randomNumber+"");
            if (randomNumber > userNum) {
                System.out.println("загаданное число больше");

            } else if (randomNumber < userNum) {
                System.out.println("загаданное число меньше");

            } else if (randomNumber == userNum) {
                System.out.println("Вы угадали");
                break;
            } else {
                System.out.println("выход из программы");
                break;
            }
        };
    }
};