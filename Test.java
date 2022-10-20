package com.learn.test1;

public class Test {
    //Do implementation of the above application with below two methods : I. Use an
    //ArrayList which will be used to store the employees and use enumeration/iterator
    //to process the employees. II. Use a TreeSet Object to store employees on the
    //basis of their EmpId and use enumeration/iterator to process employees. [Hint:
    //Use Comparable interface] Write a Test Program to test that all functionalities are
    //operational.
    //List enumeration / Iterator
    public static void main(String[] args) {
        EmployeeDB empDb = new EmployeeDB();

        Employee emp1=new Employee(1,"Bilvika","bil@gmail.com",'f',90000);
        Employee emp2=new Employee(2,"Kasturi","kas@gmail.com",'f',95000);
        Employee emp3=new Employee(3,"Lohith","loh@gmail.com",'m',120000);
        Employee emp4=new Employee(4,"Ghanta","ghanta@gmail.com",'f',98000);

        empDb.addEmployee(emp1);
        empDb.addEmployee(emp2);
        empDb.addEmployee(emp3);
        empDb.addEmployee(emp4);

        for(Employee emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());
        System.out.println();
        empDb.deleteEmployee(2);

        for(Employee emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());

        System.out.println();
        System.out.println(empDb.showPaySlip(3));

    }
}
