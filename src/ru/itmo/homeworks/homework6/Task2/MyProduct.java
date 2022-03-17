package ru.itmo.homeworks.homework6.Task2;

//        Класс МоиПродукты:
//        Свойства: максимальное количество белков / жиров / углеводов / калорий / список продуктов (массив)
//        Реализовать метод, который принимает на Продукт и добавляет его в список,
//        если характеристики продукта полностью соответствуют заявленным разрешениям,
//        в противном случае сообщить, по какой причине продукт не может быть добавлен в список
//        (например, слишком большое содержание калорий)
//        Реализовать метод, который выводит названия всех продуктов из списка

public class MyProduct {
    private Product[] listProduct = new Product[15];

    private int proteinsMaxValue = 300;
    private int fatsMaxValue = 400;
    private int carbohydratesMaxValue = 500;
    private int caloriesMaxValue = 600;


    public void addProductToList(Product... productProperty) {
        for (Product productItem : productProperty) {
            if (productItem.getNameProduct().length() < 0 || productItem.getNameProduct() == null) {
                throw new IllegalArgumentException("Имя должно быть длиннее одной буквы и не может быть null");
            } else {
                for (int i = 0; i < listProduct.length; i += 1) {
                    if (listProduct[i] == null) listProduct[i] = productItem;
                    if (i == listProduct.length) System.out.println("Массив заполнен");

                }
            }
            if (productItem.getCalories() > caloriesMaxValue) {
                throw new IllegalArgumentException("Превышено максимально допустимое содержание калорий");
            }
            if (productItem.getProteins() > proteinsMaxValue) {
                throw new IllegalArgumentException("Превышено максимально допустимое содержание протеинов");
            }
            if (productItem.getFats() > fatsMaxValue) {
                throw new IllegalArgumentException("Превышено максимально допустимое содержание жира");
            }
            if (productItem.getCarbohydrates() > carbohydratesMaxValue) {
                throw new IllegalArgumentException("Превышено максимально допустимое содержание углеводов");
            }
        }

    }

    public Product[] printListProduct() {
        return listProduct;
    }
}
