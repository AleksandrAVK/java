package hw2;

public class Task1 {
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
    }
}
