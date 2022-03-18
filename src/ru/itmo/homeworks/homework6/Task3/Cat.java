package ru.itmo.homeworks.homework6.Task3;

import java.util.Arrays;

//Класс Кот: имя, скорость, вес, пойманные мыши;
public class Cat {
    private String nameCat;
    private int catSpeed;
    private int catWeight;
    private Mouse [] catCaughtMice = new Mouse[100];


    public Cat() {
    }

    public Cat(String nameCat, int catSpeed, int catWeight, Mouse mouse) {
        setNameCat(nameCat);
        setCatSpeed(catSpeed);
        setCatWeight(catWeight);
        setCatCaughtMice(mouse);
    }

    public void setNameCat(String nameCat) {

        if (nameCat == null || nameCat.length() < 1) {
            throw new IllegalArgumentException("имя не может быть пустым значением или содержать одну букву");
        }
        this.nameCat = nameCat;

    }

    public void setCatSpeed(int catSpeed) {
        if (catSpeed < 0) {
            throw new IllegalArgumentException("Значение скорости кота не должно быть меньше ноля");
        }

        this.catSpeed = catSpeed;
    }

    public void setCatWeight(int catWeight) {
        if (catWeight <= 0) {
            throw new IllegalArgumentException("Значение массы кота должно быть больше ноля");
        }
        this.catWeight = catWeight;
    }

    public void setCatCaughtMice(Mouse mouse) {
        if (catCaughtMice.length < 0 || catCaughtMice.length > 100) {
            throw new IllegalArgumentException("Значение пойманых мышей не должно быть меньше ноля или больше 100");
        }
        for ( int i = 0; i < catCaughtMice.length; i+=1) {
            if(catCaughtMice[i] == null) catCaughtMice[i] = mouse;
        }
    }

    public void deleteMiceFromCat(Mouse [] catCaughtMice,Mouse mouse) {
        if (catCaughtMice.length < 1 || catCaughtMice.length > 100) {
            throw new IllegalArgumentException("Значение пойманых мышей не должно быть меньше ноля или больше 100");
        }
        for ( int i = 0; i < catCaughtMice.length; i+=1) {
            if(catCaughtMice[i] != null) catCaughtMice[i] = null;
        }
    }

    public String getNameCat() {
        return nameCat;
    }

    public int getCatSpeed() {
        return catSpeed;
    }

    public int getCatWeight() {
        return catWeight;
    }

    public Mouse[] getCatCaughtMice() {
        return catCaughtMice;
    }


    public void battleCatVsMouse(Mouse mouse) {
        if (getCatSpeed() > mouse.getMouseSpeed()) {
            setCatCaughtMice(mouse);
        }
    }

    //        Кот может напасть на другого кота и, если он больше противника (по весу),
//        то может отобрать его мышей (если скорость мыши выше, чем скорость кота, она убежит).
    public void catVsCat(Cat cat) {
        if(this == cat) {
            System.out.println("Кот напал сам на себя");
            return;
        }
        if (catWeight > cat.catWeight) {
            for (int i = 0; i < cat.getCatCaughtMice().length; i+=1)
           {
               if(cat.getCatCaughtMice()[i] != null && getCatSpeed() >cat.getCatCaughtMice()[i].getMouseSpeed()){
                    setCatCaughtMice(cat.getCatCaughtMice()[i]);
                    cat.deleteMiceFromCat(getCatCaughtMice(),cat.getCatCaughtMice()[i]);
                }
            }

        }

    }

    public void setCatCaughtMice(Mouse[] catCaughtMice) {
        this.catCaughtMice = catCaughtMice;
    }

    public String toString() {
        return "Cat{" +
                "nameCat= " + nameCat + " " +
                ", catSpeed=" + catSpeed +
                ", catWeight=" + catWeight +
                ", catCaughtMice=" + Arrays.toString(catCaughtMice) + // TODO выясни  почему возвращает тут ссылки, а не данные мышей ???
                '}';
    }
}