package SeventhSeminar.observer;


public class Company {

    private String name;

    private Vacancy vacancy;

    private Publisher jobAgency;



    public Company(String name, Publisher jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
    }

    public void createVacancy(String jobName, int maxSalary){
        vacancy = new Vacancy(jobName, maxSalary);
    }


    public void needEmployee(){
        jobAgency.sendOffer(name, vacancy);
    }

}
