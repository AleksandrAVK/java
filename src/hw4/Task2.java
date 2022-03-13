package hw4;
//Создайте массив из чётных чисел [2;20] и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
public class Task2 {
    public static void main(String[] args) {
        int [] evenNum = {2,4,6,8,10,12,14,16,18,20};

        for (int i = evenNum.length -1; i > 0; i --){
            System.out.println(evenNum[i]);
        }
    }
}
