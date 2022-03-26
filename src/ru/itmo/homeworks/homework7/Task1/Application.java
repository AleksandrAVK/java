package ru.itmo.homeworks.homework7.Task1;


import java.util.Arrays;

public class Application {


    public static void main(String[] args) {
        School school = new School();

        System.out.println(school);
        String schoolName = "Sirius";
        Director director = new Director("Ivan Vasilievich", 57);
        Teacher teacher1 = new Teacher("Ivan1", 35, "Math");
        Teacher teacher2 = new Teacher("Olga", 36, "Singing");
        Teacher teacher3 = new Teacher("Petr", 37, "Painting");
        Teacher teacher4 = new Teacher("Anastasiya", 38, "Geometry");
        Student student1 = new Student("IvanStudent", 12, "Math");
        Student student2 = new Student("OlgaStudent", 13, "Singing");
        Student student3 = new Student("PetrStudent", 14, "Painting");
        Student student4 = new Student("AnastasiyaStudent", 15, "Geometry");
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);
        school.addTeacher(teacher4);
       System.out.println("teacherArr" + Arrays.toString(school.getTeachers()));
      System.out.println("StudentArr" +Arrays.toString( school.getStudents()));
        school.skillTeacherSet();
        school.dayOfSchool(director,school.getTeachers(),school.getStudents());


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
