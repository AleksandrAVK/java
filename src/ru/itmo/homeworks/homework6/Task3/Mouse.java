package ru.itmo.homeworks.homework6.Task3;

public class Mouse {
    int mouseSpeed = 10;

    public  Mouse(){};
    public  Mouse(int mouseSpeed){
        setMouseSpeed(mouseSpeed);
    };

    public void setMouseSpeed(int mouseSpeed) {
        if (mouseSpeed < 0) {
            throw new IllegalArgumentException("Значение скорости кота не должно быть меньше ноля");
        }
        this.mouseSpeed = mouseSpeed;
    }
    public int getMouseSpeed(){
        return mouseSpeed;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "mouseSpeed=" + mouseSpeed +
                '}';
    }
}
