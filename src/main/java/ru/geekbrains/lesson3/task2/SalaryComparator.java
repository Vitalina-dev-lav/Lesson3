package ru.geekbrains.lesson3.task2;

import java.util.Arrays;
import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return Double.compare(o2.calculateSalary(), o1.calculateSalary());

        /*if (o1.calculateSalary() > o2.calculateSalary())
        {
            return 1;
        }
        else if (o1.calculateSalary() == o2.calculateSalary()){
            return 0;
        }
        else{
            return -1;
        }*/
    }
}

class WorkersArray {
    private Worker[] workers;

    public WorkersArray(Worker[] workers) {
        this.workers = workers;
    }


    // Метод для сортировки массива работников по заработной плате
    public void sortByAverageSalary() {
        Arrays.sort(workers, Comparator.comparing(Worker::calculateSalary));
    }

}