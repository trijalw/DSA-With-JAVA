import java.util.Scanner;

class Employee{
    String name;
    int employee_id;
    void getEmployeeDetails(int employee,String name)
    {
        employee_id = employee;
        this.name = name;
    }
    void displayDetails()
    {
        System.out.println(employee_id);
        System.out.println(name);
    }
}
class SalaryEmployee extends Employee{
    double basicSalary;
    double bonus;
    void calculateSalary(double basic,double bonus)
    {
        basicSalary = basic;
        this.bonus = bonus; 
    }
    void displaySalary()
    {
        double Salary = basicSalary + bonus;
        System.out.println(Salary);
        
    }
}

public class Salary_System {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int employeeId = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double basicSalary = sc.nextDouble();
            double bonus = sc.nextDouble();
            SalaryEmployee s = new SalaryEmployee();
            s.getEmployeeDetails(employeeId, name);
            s.displayDetails();
            s.calculateSalary(basicSalary, bonus);
            s.displaySalary();
        }
    }
}
