package ru.geekbrains.lesson3.task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(60000, 120001);
        return new Worker(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary);
    }
//  public static Freelancer generateFreelancer(){
//         String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
//         String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

//         int salary = random.nextInt(60000, 120001);
//         return new Freelancer(
//                 surnames[random.nextInt(surnames.length)],
//                 names[random.nextInt(names.length)],
//                 salary);
//     }

    public static Worker[] generateEmployees(int count){
        Worker[] workers = new Worker[count];
        for (int i = 0; i < count; i++){
            workers[i] = generateWorker();
        }
        return workers;
    }


    //   public static Freelancer[] generateEmployees(int count){
    //     Freelancer[] freelancer = new Freelancer[count];
    //     for (int i = 0; i < count; i++){
    //         freelancer[i] = generateFreelancer();
    //     }
    //     return freelancer;
    // }

    }