package com.learn.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ArrayList of Employee( id,name,address,sal) objects
class EmployeeDetails {
    private int EmpId;
    private String EmpName;
    private String EmpAddress;
    private float EmpSal;
    public EmployeeDetails(int empId, String empName, String empAddress, float empSal){
        super();
        EmpId=empId;
        EmpName=empName;
        EmpAddress=empAddress;
        EmpSal=empSal;

    }
    @Override
    public String toString(){
        return "EmpId="+EmpId+", EmpName=" +EmpName+", EmpAddress="+EmpAddress+", EmpSalary="+EmpSal;
    }
    //get set empID
    public int getEmpId(){
        return EmpId;
    }

}
//Create an ArrayList of Employee( id,name,address,sal) objects and search for particular
//Employee object based on id number.
public class SearchEmpId{
    public static void main(String[] args){
        List<EmployeeDetails> list = new ArrayList<>();

        list.add(new EmployeeDetails(101, "Bob", "123 street, India", 20000));
        list.add(new EmployeeDetails(102, "Alice", "234 street, India", 30000));
        list.add(new EmployeeDetails(103, "John", "345 street, India", 25000));
        list.add(new EmployeeDetails(104, "Stuart", "456 street, India", 40000));

        Iterator<EmployeeDetails> it = list.iterator();
        int searchId = 102;
        while (it.hasNext()) {
            EmployeeDetails emp = it.next();
            if (emp.getEmpId() == searchId)
                System.out.println(emp);
        }
    }
}
