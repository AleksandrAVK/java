package hw3;

import java.util.Scanner;

//Задача на while
//Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр
public class Task2 {
    public static void main(String[] args) {
        int userNum = 0;

        int firstCirclePercent = 0;
        int firstCircleDivision = 0;
        int firstCircleDivisionRepeat = 0;
        int firstCirclePercentRepeat = 0;
        int secondCirclePercent = 0;
        int secondCircleDivision = 0;

        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число");
        userNum = scanner.nextInt();
        while(userNum >0){
            result = result + (userNum % 10);
            userNum = userNum/10;
        }
        System.out.println("result --->" + result + "");
        System.out.println("userNum --->" + userNum + "");




//        if (userNum > 0) {
//            if (userNum > 99 & userNum <= 999) {
//                firstCircleDivision = userNum / 10;
//                firstCirclePercent = userNum % 10;
//                firstCircleDivisionRepeat = firstCircleDivision / 10;
//                firstCirclePercentRepeat = firstCircleDivision % 10;
//                result = firstCirclePercent + firstCircleDivisionRepeat + firstCirclePercentRepeat;
//
//            } else if (userNum > 9 & userNum <= 99) {
//                secondCircleDivision = userNum / 10;
//                secondCirclePercent = userNum % 10;
//                result = secondCircleDivision + secondCirclePercent;
//            } else {
//                System.out.println("Вы ввели не верное число");
//            }
//            System.out.println("result --->" + result + "");
//
//        };
    };
};
