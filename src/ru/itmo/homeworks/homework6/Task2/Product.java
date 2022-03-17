package ru.itmo.homeworks.homework6.Task2;

import java.util.Objects;

//    Свойства: название продукта / белки / жиры / углеводы / калории  proteins / fats / carbohydrates / calories
//        Класс Продукт:
//        Свойства: название продукта / белки / жиры / углеводы / калории
//        Минимум 4 конструктора
//        Реализовать необходимые проверки входящих данных
//        Создать не менее 4 экземпляров данного класса (объектов)

public class Product {

    private String nameProduct = "";
    private int proteins = 0;
    private int fats = 0;
    private int carbohydrates = 0;
    private int calories = 0;

    public Product() {
    }

    public Product(String nameProduct) {
        setNameProduct(nameProduct);
    }

    public Product(int proteins) {
        setProteins(proteins);
    }

    public Product(String nameProduct, int proteins, int fats, int carbohydrates, int calories) {
        setProteins(proteins);
        setNameProduct(nameProduct);
        setFats(fats);
        setCarbohydrates(carbohydrates);
        setCalories(calories);
    }


    public Product(int proteins, int fats, int carbohydrates, int calories) {
        setProteins(proteins);
        setFats(fats);
        setCarbohydrates(carbohydrates);
        setCalories(calories);
    }

    public void setNameProduct(String nameProduct) {

        if (nameProduct.length() < 1 || nameProduct == null ) {
            throw new IllegalArgumentException("имя не может быть пустым значением или содержать одну букву");
        }
        this.nameProduct = nameProduct;

        }



    public void setProteins(int proteins) {
        if (proteins < 0) {
            throw new IllegalArgumentException("Значение протеинов должно быть больше ноля");
        }

        this.proteins = proteins;
    }

    public void setFats(int fats) {
        if (fats < 0) {
            throw new IllegalArgumentException("Значение fats должно быть больше ноля");
        }

        this.fats = fats;

    }

    public void setCarbohydrates(int carbohydrates) {
        if (carbohydrates < 0) {
            throw new IllegalArgumentException("Значение углеводов должно быть больше ноля");
        }

        this.carbohydrates = carbohydrates;
    }

    public void setCalories(int calories) {
        if (calories < 0) {
            throw new IllegalArgumentException("Значение калорий должно быть больше ноля");
        }
        this.calories = calories;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getProteins() {
        return proteins;
    }

    public int getFats() {
        return fats;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public int getCalories() {
        return calories;
    }
    public String getAllProduct() {
        return "Product{" +
                "nameProduct= " + nameProduct + '\'' +
                ", proteins= " + proteins +
                ", fats= " + fats +
                ", calories= " + calories+
                '}';
    }
}
