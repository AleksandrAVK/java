package ru.itmo.homeworks.homework7.Task1;

import java.util.Arrays;

public class School {
    private String schoolName = "Sirius";
    private Director director = new Director("Ivan Vasilievich", 57);
    Teacher teacher1 = new Teacher("Ivan1", 35, "Math");
    Teacher teacher2 = new Teacher("Olga", 36, "Singing");
    Teacher teacher3 = new Teacher("Petr", 37, "Painting");
    Teacher teacher4 = new Teacher("Anastasiya", 38, "Geometry");
    Student student1 = new Student("IvanStudent", 12, "Math");
    Student student2 = new Student("OlgaStudent", 13, "Singing");
    Student student3 = new Student("PetrStudent", 14, "Painting");
    Student student4 = new Student("AnastasiyaStudent", 15, "Geometry");
    private Teacher[] teachers = {teacher1, teacher2, teacher3, teacher4};
    private Student[] students = {student1, student2, student3, student4};

    public void skillTeacherSet() {
        for (Teacher item : teachers) {
            item.setSkillTeacher((int) (1 + Math.random() * 100));
        }
    }

    public void dayOfSchool(Teacher[] teacher, Student[] student) {
        director.startClasses();
        for (int i = 0; i < student.length; i += 1) {
            for (int y = 0; y < teacher.length; y += 1) {
                if (teacher[y].getSchoolSubject() == student[i].getSchoolSubject()) {
                    student[i].studies(1 + Math.random() * 100);
                }
            }
        }

        director.endClasses();
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", director=" + director +
                ", teacher1=" + teacher1 +
                ", teacher2=" + teacher2 +
                ", teacher3=" + teacher3 +
                ", teacher4=" + teacher4 +
                ", student1=" + student1 +
                ", student2=" + student2 +
                ", student3=" + student3 +
                ", student4=" + student4 +
                ", teachers=" + Arrays.toString(teachers) +
                ", students=" + Arrays.toString(students) +
                '}';
    }


}

//
//    Класс Школа создается со следующими
//
//        характеристиками:
//
//        название - задается при создании объекта и не может быть изменено в последствии
//        директор - школа не может функционировать без директора
//        учителя[] - массив
//        ученики[] - массив
//        методом:
//
//        день в школе():
//        директор объявляет начало занятий
//        учителя учат учеников (предмет учителя и ученика должны совпадать, уровень знаний ученика
//        в процессе обучения должен увеличиваться)
//        директор объявляет окончание занятий
//        Общие свойства необходимо вынести в родительские классы
//        (какие определить самостоятельно) В классах можно добавлять методы и свойства при необходимости