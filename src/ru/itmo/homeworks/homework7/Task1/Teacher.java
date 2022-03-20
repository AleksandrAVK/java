package ru.itmo.homeworks.homework7.Task1;


import ru.itmo.homeworks.homework7.Task1.base.UnitSubject;

public class Teacher extends UnitSubject {
    public double skillTeacher = 1 + Math.random() * 100;

    public Teacher(String name, int age, String schoolSubject) {
        super(name, age, schoolSubject);
    }

    public void setSkillTeacher(double skillTeacher) {
        if (skillTeacher < 0 || skillTeacher > 100) {
            throw new IllegalArgumentException("Навык учителя должен быть в диапазоне от 0 до 100 единиц");
        }
        this.skillTeacher = skillTeacher;
    }

    public double getSkillTeacher() {
        return skillTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "skillTeacher=" + skillTeacher +
                ", name='" + name + '\'' +
                ", age= " + age +
                ", schoolSubject='" + schoolSubject + '\'' +
                '}';
    }
}

//
//    Класс Учитель создается со следующими
//
//        харатеристиками:
//
//        имя (тип String)
//        возраст (тип int)
//        название преподаваемого предмета (тип String)
//        навык учителя (тип int) - максимум, на который может быть увеличен уровень знаний ученика
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
//        объявить начало занятий() - вывод информации в консоль
//        объявить окончание занятий занятий() - вывод информации в консоль
