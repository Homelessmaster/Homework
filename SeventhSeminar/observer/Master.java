package SeventhSeminar.observer;

public class Master implements Observer{

    private String name;
    private String profession;
    private int salary = 80000;

    public Master(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    @Override
    public boolean receiveOffer(String nameCompany, Vacancy vacancy) {
        if ((vacancy.getJobName() == profession) && (vacancy.getSalary() >= salary)){
            System.out.printf("%s %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; профессия: %s)\n",
                    profession, name, nameCompany, vacancy.getSalary(), vacancy.getJobName());
            return true;
            
        }
        else {
            if((vacancy.getJobName() != profession) && (vacancy.getSalary() >= salary)){
                System.out.printf("%s %s: Это не моя профессия! (компания: %s; заработная плата: %d; профессия: %s)\n",
                        profession, name, nameCompany, vacancy.getSalary(), vacancy.getJobName());
            }
            else{
                System.out.printf("%s %s: Я найду работу получше! (компания: %s; заработная плата: %d; профессия: %s)\n",
                        profession, name, nameCompany, vacancy.getSalary(), vacancy.getJobName());
            }
            return false;
        }
    }
}
