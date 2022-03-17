package ru.itmo.homeworks.homework6.Task3;

public class Mouse {
    int mouseSpeed = 10;

    public  Mouse(){};
    public  Mouse(int mouseSpeed){};

    public int setMouseSpeed(int mouseSpeed) {
        if (mouseSpeed < 0) {
            throw new IllegalArgumentException("Значение скорости кота не должно быть меньше ноля");
        }
        return  mouseSpeed;
    }
    public int getMouseSpeed(){
        return mouseSpeed;
    }
}
