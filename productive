package employeewage;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		final int FullTime=1;
        final int PartTime=2;
        final int wagePerHour=20;
        int workingHrs=0;
        int empWage=0;
        
        int empCheck=(int)Math.floor(Math.random()*10)%3;
        switch (empCheck)
        {
        case FullTime:
            System.out.println("Employee is Present Full time");
            workingHrs=8;
            break;
        case PartTime:
            System.out.println("Employee is Present Part time");
            workingHrs=4;
            break;
        default:
            System.out.println("Employee is Absent");    
        }
        empWage=workingHrs*wagePerHour;
        System.out.println("Employee Daily Wage is " +empWage);

	}

}
