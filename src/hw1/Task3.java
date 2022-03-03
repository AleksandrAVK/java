package hw1;

public class Task3 {
    public static void main(String[] args) {
        int length = 5;
        int width = 3;
        int height = 4;
        int intermediateValue = (length * width) + (length * height) + (height * width);
        int square = 2*intermediateValue;

        System.out.println(square);


    }
}
