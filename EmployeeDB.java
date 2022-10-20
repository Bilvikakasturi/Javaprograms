package com.learn.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
    //b) Create one more class EmployeeDB which has the following methods. i) boolean
    //addEmployee(Employee e) ii) boolean deleteEmployee(int empId) iii) String
    //showPaySlip(int empId) iv) Employee[] listAll()
    List<Employee> employeeDb=new ArrayList<>();
    public boolean addEmployee(Employee e){
        return employeeDb.add(e);
    }
    public boolean deleteEmployee(int empId){
        boolean isRemoved=false;
        Iterator<Employee> it=employeeDb.iterator();
        while(it.hasNext()){
            Employee emp=it.next();
            if(emp.getEmpId()==empId){
                isRemoved=true;
                it.remove();
            }
        }
        return isRemoved;
    }
    public String showPaySlip(int empId){
        String paySlip="Invalid employee id";
        for(Employee e:employeeDb){
            if(e.getEmpId()==empId){
                paySlip="Payslip for employee id "+empId+"is:"+e.getEmpSalary();
            }
        }
        return paySlip;
    }
    public Employee[] listAll(){
        Employee[] empArray=new Employee[employeeDb.size()];
        for(int i=0;i< employeeDb.size();i++){
            empArray[i]=employeeDb.get(i);
        }
        return empArray;
    }
}
