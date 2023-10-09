package ThirdHomework;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    static Random random = new Random();

    static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };


        int salary = random.nextInt(50000, 110000);
        int age = random.nextInt(18, 66);
        Worker worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, salary);
        return worker;
    }
    static Freelancer generateFreelancer(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };


        int salary = random.nextInt(300, 1001);
        int age = random.nextInt(18, 66);
        Freelancer freelancer = new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, salary);
        return freelancer;
    }

    /**
     * TODO: Переработать метод generateEmployees. Метод должен возвращать массив сотрудников
     *  разных типов (Worker, Freelancer), метод должен быть ОДИН!
     * @param count
     * @return
     */
    static Employee[] generateEmployees(int count){

        Employee[] employees = new Employee[count];

        for (int i = 0; i < employees.length; i++){

            int randomEmployee = random.nextInt(0, 2);

            if(randomEmployee == 0){

                employees[i] = generateWorker();

            } else employees[i] = generateFreelancer();
        }
        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(15);

        // Arrays.sort(employees, new SalaryComparator(SortType.Ascending));

        // for (Employee employee: employees) {
        //     System.out.println(employee);
        // }

        // System.out.println();

        // Arrays.sort(employees, new SalaryComparator(SortType.Descending));

        // for (Employee employee: employees) {
        //     System.out.println(employee);
        // }

        // System.out.println();
 


        
        /*
         * Сортировка по виду рабочего
         */
        Arrays.sort(employees, new EmployeeComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        /*
         * Сортировка по возрасту рабочего
         */
        Arrays.sort(employees, new AgeComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

}
