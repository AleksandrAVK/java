package hw2;

public class Task3 {
    public static void main(String[] args) {
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

    }
}
