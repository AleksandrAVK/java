package ru.itmo.homeworks.homework7.Task1;


public class Application {
    public static void main(String[] args) {
        School school = new School();
        school.skillTeacherSet();
        school.dayOfSchool(school.getTeachers(), school.getStudents());
        System.out.println(school.toString());
    }

}


//
//Задача 1. Школа
//        Класс Ученик создается со следующими
//
//        характеристиками:
//
//        имя (тип String)
//        возраст (тип int)
//        название изучаемого предмета (тип String)
//        уровень знаний (тип int)
//        методом:
//
//        учиться(навык_учителя) - уровень знаний ученика повышается на рандомное значение в диапазоне [0, навык_учителя]
//        Класс Учитель создается со следующими
//
//        харатеристиками:
//
//        имя (тип String)
//        возраст (тип int)
//        название преподаваемого предмета (тип String)
//        навык учителя (тип int) - максисмум, на который может быть увеличен уровень значний ученика
//        методом:
//
//        учить(обучаемый)
//        Класс Директор создается со следующими
//
//        харатеристиками:
//
//        имя (тип String)
//        возраст (тип int)
//        методами:
//
//        объявить начало занятий() - вывод информации в косоль
//        объявить окончание занятий занятий() - вывод информации в косоль
//        Класс Школа создается со следующими
//
//        харатеристиками:
//
//        название - задается при создании объекта и не может быть изменено в последствии
//        директор - школа не может функционировать без директора
//        учителя[] - массив
//        ученики[] - массив
//        методом:
//
//        день в школе():
//        директор объявляет начало занятий
//        учителя учат учеников (предмет учителя и ученика должны совпадать, уровень знаний ученика в процессе обучения должен увеличиваться)
//        директор объявляет окончание занятий
//        Общие свойства необходимо вынести в родительские классы (какие определить самостоятельно) В классах можно добавлять методы и свойства при необходимости
//