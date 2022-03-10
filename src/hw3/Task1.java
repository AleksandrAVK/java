package hw3;

//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class Task1 {
    public static void main(String[] args) {
//        Задача 1

        for (int count = 0, num = 1; count >= 0 && count < 56; count += 1, num += 2) {
            System.out.println(num);

        };
    };
};


