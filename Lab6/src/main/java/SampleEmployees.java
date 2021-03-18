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
    Employee Susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
    Employee Mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
    Employee Joy =new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
    
    
    System.out.println(Susan.getName());
    System.out.println(Susan.getIDnumber());
    System.out.println(Susan.getDepartment());
    System.out.println(Susan.getPosition());
    }
    
  
}
