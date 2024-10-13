import java.util.PriorityQueue;

class Employee{
    private String Name;
    private int EmpId;
    private double Salary;
    static int EmpCount;
    static double TotalSalaryExpense;

    Employee(String name,int id, double salary){
        this.Name = name;
        this.EmpId = id;
        this.Salary = salary;
        EmpCount++;
        TotalSalaryExpense+=this.Salary;
    }

    int getTotalEmployees(){
        return Employee.EmpCount;
    }

    void calculateTotalSalaryExpense(double amount){
        Employee.TotalSalaryExpense += amount;
    }

    void applyRaise(double percent){
        double amount = (this.Salary/100)*percent;
        this.Salary = this.Salary + amount;
        calculateTotalSalaryExpense(amount);
    }

    void getEmployeeDetails(){
        System.out.println("Name: "+this.Name);
        System.out.println("ID: "+this.EmpId);
        System.out.println("Salary: "+this.Salary);
    }
}



public class Q3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Atharva",17,45000.24);
        Employee e2 = new Employee("Aditya",117,55000.24);
        Employee e3 = new Employee("Anchal",174,45350.30);
        Employee e4 = new Employee("Amey",317,49500);
        Employee e5 = new Employee("govind",147,60200.40);

        System.out.println("Before salary update ");
        System.out.println();
        e2.getEmployeeDetails();
        System.out.println("Total Employee count: "+Employee.EmpCount);
        System.out.println("Total Salary Expenses: "+Employee.TotalSalaryExpense);

        e2.applyRaise(30);
        System.out.println("After salary update ");
        System.out.println();
        e2.getEmployeeDetails();
        System.out.println("Total Employee count: "+Employee.EmpCount);
        System.out.println("Total Salary Expenses: "+Employee.TotalSalaryExpense);
    }
}
