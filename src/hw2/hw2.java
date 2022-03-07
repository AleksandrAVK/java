package hw2;

public class hw2 {
    public static void main(String[] args) {
//        Задача 1
        int count = 100;
        if (count >= 0 && count < 101) {
            if (count > 89) {
                System.out.println("отлично");
            } else if (count > 59) {
                System.out.println("хорошо");
            } else if (count > 39) {
                System.out.println("удовлетворительно");
            } else {
                System.out.println("попробуйте в следующий раз");
            }
        }

//        Задача 2

        double firstNum = 15;
        double secondNum = 10;
        int operator = 9;
        double result;
        switch (operator) {
            case 3:
                result = firstNum + secondNum;
                System.out.println(result);
                break;
            case 5:
                result = firstNum - secondNum;
                System.out.println(result);
                break;
            case 7:
                result = firstNum * secondNum;
                System.out.println(result);
                break;
            case 9:
                result = firstNum / secondNum;
                System.out.println(result);
                break;
            default:
                System.out.println("Ошибка");

        }


//        Задача 3

//        Задача на Math.random() и if
//        Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500] в интервал (25;200) и выводить результат в консоль.
//
//                Примеры работы программы:
//
//        Число 345 не содержится в интервале (25;200)
//        Число 110 содержится в интервале (25;200)


        int randomNumber = 100;
        if (randomNumber > 9 && randomNumber < 501) {

            if (randomNumber > 24 && randomNumber < 201) {
                System.out.println(randomNumber);
            } else {
                System.out.println("Случайное число не попадает в интервал от 25 до 200");
            }
        } else {
            System.out.println("Случайное число не попадает в заданный диапозон от 10 до 500");
        }


        //        Задача 4


        int age = 100;
        int exp = 25;
        if (age <= 100) {

            if (exp >= 5) {
                System.out.println("Вы подходите на должность разработчика");
            } else {
                System.out.println("Вы подходите на должность стажера");
            }
        } else {
            System.out.println("Мы Вам перезвоним");
        }

    }
}

