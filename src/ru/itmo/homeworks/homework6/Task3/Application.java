package ru.itmo.homeworks.homework6.Task3;

//Задача 3. Коты и мыши
//        Класс Мышь: скорость.
//        Класс Кот: имя, скорость, вес, пойманные мыши;
//        Кот хранит информацию о пойманных мышах (максимум о 100).
//        Кот ловит мышь, только, если его скорость выше, чем у мыши.
//        Кот может напасть на другого кота и, если он больше противника (по весу),
//        то может отобрать его мышей (если скорость мыши выше, чем скорость кота, она убежит).

public class Application {
    public static void main(String[] args) {

        Mouse mouse1 = new Mouse(25);
        Mouse mouse2 = new Mouse(55);
        Mouse mouse3 = new Mouse(95);
        Cat cat1 = new Cat("Micki", 50, 7,  mouse1);

        Cat cat2 = new Cat("Bob",57,19, mouse2);
        Cat cat3 = new Cat("IVAN_Batman", 919, 89, mouse3);



        System.out.println("cat before BattleCatVsMouse " +cat1.toString());
        cat1.battleCatVsMouse(mouse1);
        System.out.println("cat after BattleCatVsMouse " +cat1.toString());
        cat2.battleCatVsMouse(mouse2);
        cat3.battleCatVsMouse(mouse3);

        System.out.println("cat before Battle CatVsCat " +cat1.toString());
        cat1.catVsCat(cat2);
        System.out.println("cat after Battle CatVsCat " +cat1.toString());
        cat2.catVsCat(cat3);

        System.out.println(cat1.toString());

    }
}
