public class EmpWage{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int Wage_per_hour = 20;
    public static void main (String[] args){
        System.out.println(" Welcome To Employee Wage");
        int Emp_wage_hour;
        int empCheck = (int) Math.floor(Math.random()*10)%3;
        // used Switch case for Employee_Wage
        switch (empCheck) {
            case IS_FULL_TIME:
                Emp_wage_hour = 8 ;
                break;
            case IS_PART_TIME:
                Emp_wage_hour = 4;
                break;
            default:
                Emp_wage_hour = 0;
        }
    public static void main(String[] args){
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int Wage_per_hour = 20;
        int Emp_wage_hour;
        double empCheck = Math.floor(Math.random()*10)%3;
        //  Part Time wagge and Full time wage
        if ( empCheck == IS_FULL_TIME )
            //Employee is Present
            Emp_wage_hour = 8 ;
        else if ( empCheck == IS_PART_TIME )
            //Employee is Absent
            Emp_wage_hour = 4;
        else
            Emp_wage_hour = 0;

int Emp = Emp_wage_hour * Wage_per_hour;
        System.out.println("Wage of a employee per day : " + Emp);
    }
}