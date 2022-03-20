package ru.itmo.homeworks.homework7.Task1;

import ru.itmo.homeworks.homework7.Task1.base.Unit;

public class Director extends Unit {

    public Director(String name, int age) {
        super(name, age);
    }

    public void startClasses() {
        System.out.println("Начало занятий");
    }

    public void endClasses() {
        System.out.println("Окончание занятий");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


//    Класс Директор создается со следующими
//
//        харатеристиками:
//
//        имя (тип String)
//        возраст (тип int)
//        методами:
//
//        объявить начало занятий() - вывод информации в косоль
//        объявить окончание занятий занятий() - вывод информации в косоль