package hw2;

public class Task3 {
    public static void main(String[] args) {
        double randomNumber = Math.random(); //[0;1)
        System.out.println((int)(randomNumber *7 ));// [0;7)
        System.out.println((int)(3 + randomNumber *7 ));// [3;7) 3 это нижняя граница,а 7 это верняя граница
          if (randomNumber > 9 && randomNumber < 501) {

            if (randomNumber > 24 && randomNumber < 201) {
                System.out.println(randomNumber);
            } else {
                System.out.println("Случайное число не попадает в интервал от 25 до 200");
            }
        } else {
            System.out.println("Случайное число не попадает в заданный диапозон от 10 до 500");
        }

    }
}
