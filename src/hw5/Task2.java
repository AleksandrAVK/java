package hw5;
//Заменить все буквы в слове на строчные, а первую букву на заглавную.
// Например, дано hello, получаем Hello / дано HeLLO, получаем Hello.

import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        String string = "hello";
        String string2 = "HeLLO";

        String result = string2.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
        System.out.println(result);
    }
}
