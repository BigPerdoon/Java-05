package org.example;


public class Main {

    public int calculate(int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= expenses) { // можем ли отдыхать?
                count += 1; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
            } else {
                money = money + income;
            }
        }
        return count;
    }
}