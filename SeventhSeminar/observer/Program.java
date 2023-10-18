package SeventhSeminar.observer;

public class Program {

    /**
     *  добавил новый тип соискателя middle.
     *  Добавил новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Соискатель учитывает тип вакансии, которую ему отправили.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);
        Company geekBrains = new Company("GeekBrains", jobAgency);

        google.createVacancy("HR", 1000000);
        yandex.createVacancy("Программист", 120000);
        geekBrains.createVacancy("HR", 30000);

        Student student1 = new Student("Студент #1", "Программист");
        Master master1 = new Master("Мастер #1", "HR");
        Master master2 = new Master("Мастер #2", "HR");
        Middle middle = new Middle("Middle #1", "Программист");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(middle);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }

}
