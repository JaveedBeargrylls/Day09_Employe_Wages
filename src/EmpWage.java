class EmployeeWage {
    public void Emp_wage(String company, double Wage_per_hour, int Total_Working_days, int Maximum_work_hours) {
        System.out.println("\n Welcome To Employee Wage"+"\n"+"\t"+company);
        int Emp_wage_hour;
        double Monthly_wage = 0;
        int Working_days = 0, total_emp_hours = 0;
        //working days of Employee in a month and its maximum hours of work
        while (Working_days < Total_Working_days && total_emp_hours <= Maximum_work_hours) {
            Working_days++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            // checking of his work time
            Emp_wage_hour = switch (empCheck) {
                case 1 -> 8;
                case 2 -> 4;
                default -> 0;
            };
            // calculation of wage and time of an Employee in a month
            total_emp_hours += Emp_wage_hour;
            double Emp = Emp_wage_hour * Wage_per_hour;
            System.out.println("Wage of a employee at day " + Working_days + "\t" + Emp + "\t" + "Work time :" + " " + Emp_wage_hour);
            Monthly_wage += Emp;
        }
        System.out.println("Monthly Wages of an Employee : " + Monthly_wage + "\n" + "Monthly Working Hours of an employee : " + total_emp_hours + "hours");
    }

}
public class EmpWage{
    public static void main(String[] args){
        EmployeeWage obj = new EmployeeWage();
        obj.Emp_wage("More",25.98,26,18);
        obj.Emp_wage("Reliance",20.63,24,12);
        obj.Emp_wage("KFC",25.76,30,20);

    }
}