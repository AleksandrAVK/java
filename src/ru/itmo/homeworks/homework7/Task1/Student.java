package ru.itmo.homeworks.homework7.Task1;

import ru.itmo.homeworks.homework7.Task1.base.UnitSubject;


public class Student extends UnitSubject {
   private double knowledgeLevel;
    public Student(String name, int age, String schoolSubject) {
        super(name, age, schoolSubject);
    }

    public void setKnowledgeLevel(double knowledgeLevel) {
        if (knowledgeLevel < 0) {
            throw new IllegalArgumentException("Уровень знаний должен быть больше ноля");
        }
        this.knowledgeLevel =(int) knowledgeLevel;
    }

    public void studies(double skillTeacher) {
        if (knowledgeLevel < 0 || skillTeacher < 0) {
            throw new IllegalArgumentException("Уровень знаний  и навыков должен быть больше ноля");
        }


        this.knowledgeLevel = (int)(Math.random() * skillTeacher);


    }

    @Override
    public String toString() {
        return "Student{" +
                "knowledgeLevel=" + knowledgeLevel +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", schoolSubject='" + schoolSubject + '\'' +
                '}';
    }
    //
}


//Класс Ученик создается со следующими
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
