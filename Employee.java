package com.learn.test1;

public class Employee {
    //Create an Employee class with following attributes and behaviors : i) EmpId Int ii)
    //EmpName String iii) EmpEmail String iv) EmpGender char v) EmpSalary float vi)
    //GetEmployeeDetails()
    private int EmpId;
    private String EmpName;
    private String EmpEmail;
    private char EmpGender;
    private float EmpSalary;
    public Employee(int empId,String empName,String empEmail,char empGender,float empSalary){
        super();
        EmpId=empId;
        EmpName=empName;
        EmpEmail=empEmail;
        EmpGender=empGender;
        EmpSalary=empSalary;

    }
    public String GetEmployeeDetails(){
        return "EmpId="+EmpId+", EmpName=" +EmpName+", EmpEmail="+EmpEmail+", EmpGender"+EmpGender+", EmpSalary="+EmpSalary;
    }
    //get set empID
    public int getEmpId(){
        return EmpId;
    }
    public void setEmpId(int empId){
        EmpId=empId;
    }
//    get set empName
    public String getEmpName(){
        return EmpName;
    }
    public void setEmpName(String empName){
        EmpName=empName;
    }
    //Get set EmpEmail
    public String getEmpEmail(){
        return EmpEmail;
    }
    public void setEmpEmail(String empEmail){
        EmpEmail=empEmail;
    }
    //Get set EmpGender
    public char getEmpGender(){
        return EmpGender;
    }
    public void setEmpGender(char empGender){
        EmpGender=empGender;
    }
    //Get set EmpSalary
    public float getEmpSalary(){
        return EmpSalary;
    }
    public void setEmpSalary(float empSalary){
        EmpSalary=empSalary;
    }

}
