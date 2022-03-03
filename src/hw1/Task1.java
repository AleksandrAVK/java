package hw1;

public class Task1 {
    public static void main(String[] args) {
        int sum = 1700000000;
        int discount = (int)sum/10;
        int result = sum > 1_000_00 ? sum - discount : sum;
        System.out.println(result);
    }
}
