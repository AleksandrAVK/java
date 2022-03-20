package ru.itmo.homeworks.homework7.Task1.base;

import ru.itmo.homeworks.homework7.Task1.base.Unit;

abstract public class UnitSubject extends Unit {
    protected String schoolSubject;

    public UnitSubject(String name, int age, String schoolSubject) {
        super(name, age);
        if (schoolSubject == null || schoolSubject.length() < 1) {
            throw new IllegalArgumentException("Имя предмета должно должно содержать хотя бы одну букву");
        }
        this.schoolSubject = schoolSubject;
    }

    public void setSchoolSubject(String schoolSubject) {
        if (schoolSubject == null || schoolSubject.length() < 1) {
            throw new IllegalArgumentException("Имя предмета должно должно содержать хотя бы одну букву");
        }
        this.schoolSubject = schoolSubject;
    }

    public String getSchoolSubject() {
        return schoolSubject;
    }

    @Override
    public String toString() {
        return "UnitSubject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolSubject='" + schoolSubject + '\'' +
                '}';
    }
}

