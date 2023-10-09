package ThirdHomework;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

    private SortType sortType;

    public EmployeeComparator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {

        if(sortType == SortType.Ascending){
            if(o1 instanceof Freelancer && o2 instanceof Worker){
                return 1;
            }
            if(o1 instanceof Worker && o2 instanceof Freelancer){
                return -1;
            }
            return 0;
        }
        else{
            if(o1 instanceof Freelancer && o2 instanceof Worker){
                return -1;
            }
            if(o1 instanceof Worker && o2 instanceof Freelancer){
                return 1;
            }
            return 0;
        }
    }
}
