package hw2;

public class Task2 {
    public static void main(String[] args) {
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

    }
}
