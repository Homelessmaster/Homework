package ThirdHomework;

/**
 * Рабочий (фулл-тайм)
 */
public class Worker extends Employee{

    public Worker(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s - Возраст: %s; Рабочий; Среднемесячная заработная плата (фиксированная): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }
}
