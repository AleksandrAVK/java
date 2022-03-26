package ru.itmo.homeworks.homework7.Task1;

import java.util.Arrays;

public class School {

    private Teacher[] teachersArr = new Teacher[15];
    private Student[] studentsArr = new Student[15];
// директора, учителе и учеников выносим в application. Оставляем только массивы учителей и студентов
// в школе создаём метод который добавляет по одному учителю в массив учителей и по одному ученику
// в массив учеников на 16 и 17 строке оставляем просто обьявление массива
// Изначально можно передать в шкколу массив учителей и массив учеников и вот так записать
// teachers = тот массив с учетелями который передаём.Но метод добавления по одному учителю все-равно нужен
// Аналогично с учениками.

    public void addTeacher(Teacher teacher){
        for (int i = 0; i < teachersArr.length; i++) {
            if(teachersArr[i] == null){
                teachersArr[i] = teacher;
                break;
            }
        }
    }
    public void addStudent(Student student){
        for (int i = 0; i < studentsArr.length; i++) {
            if(studentsArr[i] == null){
                studentsArr[i] = student;
                break;
            }
        }
    }

    public void skillTeacherSet() {
        for (Teacher item : teachersArr) {
            if(item != null) item.setSkillTeacher((int) (1 + Math.random() * 100));
        }
    }

    @Override
    public String toString() {
        return "School{" +
                "teachersArr=" + Arrays.toString(teachersArr) +
                ", studentsArr=" + Arrays.toString(studentsArr) +
                '}';
    }

    public void dayOfSchool(Director director, Teacher[] teacher, Student[] student) {
//        System.out.println(" dayOfSchool teacher" + Arrays.toString(teacher));
//        System.out.println(" dayOfSchool student" + Arrays.toString(student));
        director.startClasses();

        for (int i = 0; i < student.length; i += 1) {
            for (Teacher itemTeacher : teacher) {
                  if (itemTeacher != null && student[i] != null )
                    if(itemTeacher.getSchoolSubject().equalsIgnoreCase(student[i].getSchoolSubject())) {
                   student[i].studies(1 + Math.random() * 100);
                }
            }
        }

        director.endClasses();
    }

    public Teacher[] getTeachers() {
        return teachersArr;
    }

    public Student[] getStudents() {
        return studentsArr;
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