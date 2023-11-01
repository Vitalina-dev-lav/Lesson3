package ru.geekbrains.lesson3.task1;

public class Cat extends Animal{

    private static int counter;

    public static int getCounter(){
        return counter;
    }

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        counter++;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать!\n", name);
    }
}
