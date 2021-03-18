/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacks
 */
public class Employee {
    private String Name;
    private int IDnumber;
    private String Department;
    private String Position;
    
    public Employee (String Name, int IDnumber, String Department, String Position){
        this.Name = Name;
        this.IDnumber = IDnumber;
        this.Department = Department;
        this.Position = Position;
    }
    
    public Employee () {
    Name = "";
    IDnumber = 0;
    Department = "";
    Position = "";
}
    public Employee (String Name, int IDnumber){
        this.Name = Name;
        this.IDnumber = IDnumber;
        Department = "";
        Position = "";
    }
    
    public String getName(){
        return Name;
    }
    
    public void setName(){
        this.Name = Name;
    }
    
    public int getIDnumber(){
        return IDnumber;
    }
    
    public void setIDnumber(){
        this.IDnumber = IDnumber;
    }
    
    public String getDepartment(){
        return Department;
    }
    
    public void setDepartment(){
        this.Department = Department;
    }
    
    public String getPosition(){
        return Position;
    }
    
    public void setPosition(){
        this.Position = Position;
    }
}
