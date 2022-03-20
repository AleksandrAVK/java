package ru.itmo.homeworks.homework6.Task2;

//        Класс МоиПродукты:
//        Свойства: максимальное количество белков / жиров / углеводов / калорий / список продуктов (массив)
//        Реализовать метод, который принимает на Продукт и добавляет его в список,
//        если характеристики продукта полностью соответствуют заявленным разрешениям,
//        в противном случае сообщить, по какой причине продукт не может быть добавлен в список
//        (например, слишком большое содержание калорий)
//        Реализовать метод, который выводит названия всех продуктов из списка

import java.util.Arrays;

public class MyProduct {
    private String[] listProduct = new String[15];

    private int proteinsMaxValue = 300;
    private int fatsMaxValue = 400;
    private int carbohydratesMaxValue = 500;
    private int caloriesMaxValue = 600;


    public void addProductToList(Product... productProperty) {
        for (Product productItem : productProperty) {
            System.out.println("productItem ++++>" + productItem);
            if (productItem.getNameProduct() == null || productItem.getNameProduct().length() < 0) {
                throw new IllegalArgumentException("Имя должно быть длиннее одной буквы и не может быть null");
            }
            if (productItem.getCalories() > caloriesMaxValue || productItem.getProteins() > proteinsMaxValue || productItem.getFats() > fatsMaxValue || productItem.getCarbohydrates() > carbohydratesMaxValue) {
                System.out.println("Превышено максимально допустимое значение одного из показателей");
                return;
            }
            for (int i = 0; i < listProduct.length; i += 1) {
                if (listProduct[i] == null) {
                    listProduct[i] = productItem.getNameProduct();
                    break;
                }
            }


        }
        System.out.println("listProduct" + Arrays.toString(listProduct));
    }

    public String printListProduct() {
        return "MyProduct{" +
                "listProduct=" + Arrays.toString(listProduct) +
                ", proteinsMaxValue=" + proteinsMaxValue +
                ", fatsMaxValue=" + fatsMaxValue +
                ", carbohydratesMaxValue=" + carbohydratesMaxValue +
                ", caloriesMaxValue=" + caloriesMaxValue +
                '}';
    }


}
