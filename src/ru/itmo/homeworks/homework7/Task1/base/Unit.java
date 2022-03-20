package ru.itmo.homeworks.homework7.Task1.base;

abstract public class Unit {
    protected String name;
    protected int age;

    public Unit(String name, int age) {
        if (name == null || name.length() < 1 || age < 1) {
            throw new IllegalArgumentException("Имя не может быть пустым значением. Имя или возраст должны быть больше 0  или содержать более 1 буквы");
        }
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 1) {
            throw new IllegalArgumentException("Имя не может быть пустым значением. Имя должно содержать более 1 буквы");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Возраст должен быть больше 0");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


