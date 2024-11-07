import java.util.Scanner;
class Employee
{
String name;
int id;
String department;
double salary;
void displayDetails()
{
System.out.println("Employee ID: "+id);
System.out.println("Employee name: "+name);
System.out.println("Department: "+department);
System.out.println("Salary: "+salary);
double da, ta, cca, hra, gross;
da = (salary * 10) / 100;
hra = (salary * 15) / 100;
cca = 200;
ta = (salary * 2) / 100;
gross = salary + da + hra + cca + ta;
System.out.println("DA: "+da);
System.out.println("HRA: "+hra);
System.out.println("CCA: "+cca);
System.out.println("TA: "+ta);
System.out.println("Gross Salary: "+gross);
}
}
public class pgm5_EmployeeDetails
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Employee emp = new Employee();
System.out.print("Enter employee ID: ");
emp.id = sc.nextInt();
System.out.print("Enter employee name: ");
emp.name = sc.next();
System.out.print("Enter department: ");
emp.department = sc.next();
System.out.print("Enter salary: ");
emp.salary = sc.nextDouble();
System.out.println("\nEmployee Details");
emp.displayDetails();
}
}