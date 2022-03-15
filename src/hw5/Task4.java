package hw5;

//Определить, является ли срока полиндромом.

//        Палиндром — это число, буквосочетание, слово или текст, которые одинаково читаются по
//        буквам или по словам как слева направо, так и справа налево.
//        Например, 202 - палиндром / топот - палиндром / а роза упала на лапу Азора - палиндром

public class Task4 {
    public static void main(String[] args) {
      String noPalindrom = "hello";
      String palindrom = "топот";
      String reverseString = new StringBuilder(palindrom).reverse().toString();
      if(palindrom.equalsIgnoreCase(reverseString)) {
          System.out.println(" this is palindrom");
      } else{
          System.out.println(" this is something else, is not palindrom");
      }
        System.out.println(reverseString);
    }
}
