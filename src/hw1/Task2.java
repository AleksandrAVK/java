package hw1;

public class Task2 {
    public static void main(String[] args) {
        int number = 45;
        int firstNumber = number/10;

        int secondNumber = number%10;
        System.out.println("firstNumber--->"+"" +firstNumber+"");
        System.out.println("secondNumber--->"+"" +secondNumber+"");
        int sum = firstNumber + secondNumber;
        System.out.println(sum);
    }
}
