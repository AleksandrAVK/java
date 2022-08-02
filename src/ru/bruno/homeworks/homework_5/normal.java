package ru.bruno.homeworks.homework_5;

//Создать класс Car, Engine и Driver.
//        Класс Driver содержит поля - ФИО, стаж вождения.
//        Класс Engine содержит поля - мощность, производитель.
//        Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
//        Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
//        "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
//        А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.


public class normal {
    public static void main(String[] args) {
        Car car = new Car();

        car.toString();
    }

    static class Car {
        private String carBrand = "brand Bentley";
        private String carClass = "luxury";
        int carWeight = 3500;

        public String getCarBrand() {
            return carBrand;
        }

        public void setCarBrand(String carBrand) {
            this.carBrand = carBrand;
        }

        public String getCarClass() {
            return carClass;
        }

        public void setCarClass(String carClass) {
            this.carClass = carClass;
        }

        public int getCarWeight() {
            return carWeight;
        }

        public void setCarWeight(int carWeight) {
            this.carWeight = carWeight;
        }


        Driver nameDriver = new Driver();
        Engine engine = new Engine();

        @Override
        public String toString() {
            System.out.println(" carBrand = " + carBrand + "; carClass = " + carClass);
            System.out.println(" carWeight = " + carWeight);
            nameDriver.setSurname("Smith");
            nameDriver.setCountYears(35);
            nameDriver.toString();
            engine.toString();
            return null;
        }

        public void start() {
            System.out.println("Поехали");
        }

        public void stop() {
            System.out.println("Останавливаемся");
        }

        public void turnRight() {
            System.out.println("Поворот направо");
        }

        public void turnLeft() {
            System.out.println("Поворот налево");
        }


    }

    static class Engine {
        private int power = 5000;
        private String nameCompany = "Bentley";

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public String getNameCompany() {
            return nameCompany;
        }

        public void setNameCompany(String nameCompany) {
            this.nameCompany = nameCompany;
        }


        @Override
        public String toString() {
            System.out.println(" power = " + power + "; nameCompany = " + nameCompany);
            return null;
        }

    }

    static class Driver {
        private String surname = "Иван";
        private int countYears = 23;

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getCountYears() {
            return countYears;
        }

        public void setCountYears(int countYears) {
            this.countYears = countYears;
        }

        @Override
        public String toString() {
            System.out.println(" surname = " + surname + "; countYears = " + countYears);
            return null;
        }
    }
}
