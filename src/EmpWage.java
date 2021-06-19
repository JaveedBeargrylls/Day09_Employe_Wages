public class EmpWage{

    static void Emp_wage(int Wage_per_hour, int Total_Working_days, int Maximum_work_hours){
        System.out.println("Welcome To Employee Wage");
        int Emp_wage_hour;
        int Monthly_wage = 0;
        int Working_days = 0, total_emp_hours = 0;
        //working days of Employee in a month and its maximum hours of work
        while ( Working_days < Total_Working_days && total_emp_hours <= Maximum_work_hours){
            Working_days++;
            int empCheck = (int) Math.floor(Math.random()*10)%3;
            // checking of his work time
            Emp_wage_hour = switch (empCheck) {
                case 1 -> 8;
                case 2 -> 4;
                default -> 0;
            };
            // calculation of wage and time of an Employee in a month
            total_emp_hours += Emp_wage_hour;
            int Emp = Emp_wage_hour * Wage_per_hour;
            System.out.println("Wage of a employee at day "+Working_days+"\t"+ Emp + "\t" + "Work time :"+" "+Emp_wage_hour);
            Monthly_wage += Emp;
        }
        System.out.println("Monthly Wages of an Employee : " + Monthly_wage+"\n"+"Monthly Working Hours of an employee : "+total_emp_hours+"hours");
    }
    public static void main(String[] args){
        Emp_wage(30,24,100);
    }
}