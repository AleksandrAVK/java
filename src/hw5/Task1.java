package hw5;
//Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их
// в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
// В итоге в массиве будут только уникальные слова.
// Выход их программы по слову exit (слово 'exit' в массив не добавлять) или если массив заполнен
// Перед завершением программы, вывести получившийся массив в консоль


import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String word = "";
        int wordContains = 0;
        int index = 0;
        String[] arrStrings = new String[5];

        Scanner scanner = new Scanner(System.in);

        while (index <= arrStrings.length - 1) {
            System.out.print("Введите слово: ");
            word = scanner.nextLine();
            if ("exit".equalsIgnoreCase(word)) break;
            for (String item : arrStrings) {
                if (word.equalsIgnoreCase(item)) {
                    wordContains = 1;
                } else {
                    wordContains = 0;
                }

            }
                if (wordContains == 0) {
                    arrStrings[index] = word;
                    index += 1;

                }

            }
        System.out.println(Arrays.toString(arrStrings));
        }
}

