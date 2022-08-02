package ru.bruno.homeworks.homework_5;
//Создать класс Person, который содержит:
//        - переменные fullName, age;
//        - методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person ходит/говорит".


public class easy {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFullName("Neo");
        person.setAge(35);
        person.move();
        person.talk();
    }
    static class Person {
        String fullName;
        int age;

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void move(){
            System.out.printf("Звать меня  %s и  я хожу . Я %s и мой возраст  %d   ",fullName,fullName, age);
        }
        public void talk(){
            System.out.printf("%s  говорит  моё имя  %s",
                    fullName, fullName );
        }
    }
}
