package hw3;

//Пользователь загадывает число в диапазоне от [2 до 100]
//        Программа пытается его угадать (используйте метод бинарного поиска - деление отрезка на 2).
//        Программа может задавать пользователю вопросы: Число равно ...? / Число больше ...? / Число меньше ...? и в зависимоти от ответа пользователя принимать решения.
//        Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Загадайте число от 1 до 100.");
        int userAnswer = 0;
        Scanner scanner = new Scanner(System.in);
        int numForQuestion = 100 / 2;
        int step = 25;

        System.out.println("Ваше число больше 50 ? Нажмите 1, если да и 0 если нет. Если число равно нажмите 3");


        while (numForQuestion > 1 && numForQuestion < 101) {

            userAnswer = scanner.nextInt();
            if (userAnswer == 3) {
                System.out.println("Ура !!1 Машина угадало число");
                break;
            } else if (userAnswer == 1) {
                numForQuestion = numForQuestion + step;
                step = step / 2;
                if (step < 1) step = 1;
                if (numForQuestion > 99 || numForQuestion < 2) {
                    System.out.println("Вы вышли за пределы диапозона разрешенных чисел от 1 до 100. Попробуйте ещё раз");
                    break;
                }
                System.out.println("Ваше число больше " + numForQuestion + " ? Нажмите 1, если да и 0 если нет. Если число равно 3");
                continue;
            } else if (userAnswer == 0) {
                numForQuestion = numForQuestion - step;
                step = step / 2;
                if (step < 1) step = 1;
                if (numForQuestion > 99 || numForQuestion < 2) {
                    System.out.println("Вы вышли за пределы диапозона разрешенных чисел от 1 до 100. Попробуйте ещё раз");
                    break;
                }
                System.out.println("Ваше число больше " + numForQuestion + " ?  Нажмите 1, если да и 0 если нет. Если число равно 3");
                continue;
            }
        }
        ;
    }
}
