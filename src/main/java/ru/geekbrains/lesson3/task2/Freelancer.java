package ru.geekbrains.lesson3.task2;


public class Freelancer extends Employee {

    public Freelancer(String surName, String name, double salary) {
        super(surName, name, salary);
    }
    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }
  
    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата: %.2f руб.",
                surName, name, calculateSalary());
    
            }

        }
    

