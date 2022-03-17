package ru.itmo.homeworks.homework6.Task2;

//Задача 2. Список разрешенных продуктов
//        Класс Продукт:
//        Свойства: название продукта / белки / жиры / углеводы / калории
//        Минимум 4 конструктора
//        Реализовать необходимые проверки входящих данных
//        Создать не менее 4 экземпляров данного класса (объектов)
//        Класс МоиПродукты:
//        Свойства: максимальное количество белков / жиров / углеводов / калорий / список продуктов (массив)
//        Реализовать метод, который принимает на Продукт и добавляет его в список,
//        если характеристики продукта полностью соответствуют заявленным разрешениям,
//        в противном случае сообщить, по какой причине продукт не может быть добавлен в список
//        (например, слишком большое содержание калорий)
//        Реализовать метод, который выводит названия всех продуктов из списка
//        При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.


import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product("test", 1,2,3,4);
        Product product4 = new Product();
        MyProduct myProduct1 = new MyProduct();
        MyProduct myProduct2 = new MyProduct();


        product1.setNameProduct("Хлеб");
        product1.setCalories(123);
        product1.setCarbohydrates(234);
        product1.setProteins(245);
        product1.setFats(356);

        System.out.println("AllValueProduct1" + product1.getAllProduct());

        product2.setNameProduct("Молоко");
        product2.setCalories(12);
        product2.setCarbohydrates(23);
        product2.setProteins(34);
        product2.setFats(45);
        product3.setNameProduct("Овощи");
        product4.setNameProduct("Курица");

        System.out.println(product2.getAllProduct());
        System.out.println(product3.getAllProduct());
        System.out.println(product4.getAllProduct());

//        product1.setNameProduct("");
//        product1.setCalories(-123);
//        product1.setCarbohydrates(-234);

        System.out.println("AllValueProduct1" + product1.getAllProduct());

        myProduct1.addProductToList(product1);
        myProduct2.addProductToList(product2);
        System.out.println("myProduct1  " + myProduct1.printListProduct());
        System.out.println("myProduct2  " +myProduct2.printListProduct());

    }
}
