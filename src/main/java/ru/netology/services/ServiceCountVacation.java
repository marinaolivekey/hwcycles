package ru.netology.services;

public class ServiceCountVacation {
    public int calculate(int income, int expenses, int threshold) {

        int money = 0;
        int count = 0;

        for (int i = 1; i < 13; i++) {
            //System.out.println(money);
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;

            } else
                money = money + income - expenses;
        }
        return count;
    }
}
