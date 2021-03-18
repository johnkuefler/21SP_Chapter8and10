/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacks
 */
public class SampleEmployees {
    
    public static void main(String[] args) {
    Employee Susan = new Employee("Susan Meyers ", 47899, " Accounting ", "Vice President");
    Employee Mark = new Employee("Mark Jones ", 39119, " IT ", "Programmer ");
    Employee Joy =new Employee("Joy Rogers ", 81774, " Manufacturing ", "Engineer");
    
   EmployeeInfoPrint(Susan);
   EmployeeInfoPrint(Mark);
   EmployeeInfoPrint(Joy);
    }
    public static void EmployeeInfoPrint(Employee Emp){
    String EmpName = Emp.getName();
    int EmpID = Emp.getIDnumber();
    String EmpDepartment = Emp.getDepartment();
    String EmpPosition = Emp.getPosition();
    System.out.println(EmpName + EmpID + EmpDepartment + EmpPosition);
    }
  
}
