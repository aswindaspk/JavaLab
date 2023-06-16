import java.util.Scanner;
class Employee{
int eNo, eSalary;
String eName;
Employee(int eNo, String eName, int eSalary){
this.eNo = eNo;
this.eName = eName;
this.eSalary = eSalary;
}
}
class Employees{
public static void main(String[] args){
int lastIndex = 0;
Employee[] employees = new Employee[3];
Scanner sc =new Scanner(System.in);
Employees emps = new Employees();
int opt = 0;
do{
System.out.println("\n\nChoose Option: ");
System.out.println("\n1. Add new Employee\n2. Search Employee\n3. Display Employees\n4. Exit");
System.out.print("\nOption: ");
opt = sc.nextInt();
switch(opt){
case 1 : employees[lastIndex++] = emps.addNewEmployee();
break;
case 2 : System.out.print("\nEnter eNo:");
int empNo = sc.nextInt();
Employee emp = emps.searchEmployee(employees, empNo);
if(emp != null){
System.out.println("eNo\teName\teSalary\t");
System.out.println(emp.eNo+"\t"+emp.eName+"\t"+emp.eSalary);
} else{
System.out.println("There is no emplyee with eNumber:- "+ empNo +" :(");
}
break;
case 3 : emps.displayDetails(employees);
break;
case 4 : System.out.print("\n\nExiting..");System.exit(0);
break;
default : System.out.println("Invalid Option");
}
} while(opt != 4);
}
Employee addNewEmployee(){
Scanner sc = new Scanner(System.in);
System.out.print("\n\nEnter eNumber: ");
int id = sc.nextInt();
System.out.print("\nEnter Name: ");
String name = sc.next();
System.out.print("\nEnter Salary: ");
int salary = sc.nextInt();
System.out.print("\nEmployee "+name+" added");
return new Employee(id,name,salary);
}
Employee searchEmployee(Employee[] employees, int eNo){
for(Employee emp: employees){
if(emp.eNo == eNo){
return emp;
}
}
return null;
}
void displayDetails(Employee[] employees){
System.out.println("\n\nEmpID\tName\tSalary\t");
for(Employee emp:employees){
if(emp != null){
System.out.println(emp.eNo+"\t"+emp.eName+"\t"+emp.eSalary);
} else {
System.out.println("\nThere is no emplyees left:(");
return;
}
}
}
}
