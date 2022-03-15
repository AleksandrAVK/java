package hw5;
//Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
// Предложение для поиска длинного слова: "в предложении все слова разной длины".

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String proposal = "в предложении все слова разной длины";
        String longWord = "";
        String[] strArr = proposal.split(" ");
        System.out.println(Arrays.toString(strArr));
        for (String item : strArr) {
            if (item.length() - 1 > longWord.length() - 1) longWord = item;
        }
        System.out.println(longWord);
    }
}
