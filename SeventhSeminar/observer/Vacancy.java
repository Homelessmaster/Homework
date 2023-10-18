package SeventhSeminar.observer;

import java.util.Random;

public class Vacancy {
    
    private String jobName;

    private Random random = new Random();
    
    private int Salary;

    public Vacancy(String jobName, int maxSalary){
        this.jobName = jobName;
        this.Salary = random.nextInt(maxSalary);
    }
    public String getJobName() {
        return jobName;
    }
    public int getSalary() {
        return Salary;
    }
    
}
