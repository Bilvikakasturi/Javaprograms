package com.learn.test1;

import java.util.Iterator;
import java.util.Vector;
class EmployeeVector{
    private int id;
    private String name;
    private String email;
    private float salary;

    public EmployeeVector(int id, String name, String email, float salary) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
    }
        }
public class EmptyVector {
    //Write a program that will have a Vector which is capable of storing emp objects. Use an
    //Iterator and enumeration to list all the elements of the Vector.
    public static void main(String[] args) {
        Vector<EmployeeVector> list = new Vector<>();

        list.add(new EmployeeVector(101, "Bil", "b@gmail.com", 200000));
        list.add(new EmployeeVector(102, "Asturias", "k@gmail.com", 120000));
        list.add(new EmployeeVector(103, "Mellisa", "s@gmail.com", 2340000));
        list.add(new EmployeeVector(104, "Strut", "g@gmail.com", 320000));

        Iterator<EmployeeVector> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());


    }
}
