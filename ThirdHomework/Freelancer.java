package ThirdHomework;

/**
 * TODO: Разработать тип Freelancer самостоятельно в рамках выполнения
 *  домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {

    

    public Freelancer(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary * 20.8 * 8;
    }

    @Override
    public String toString() {
        return String.format("%s %s - Возраст: %s; Фрилансер; Среднемесячная заработная плата: %.2f (руб.)",
                surName, name, age, calculateSalary());
    }
}
