package com.company;

public class Employee {
    private String firstName;
    private String lastName;
    private String address;
    private int employeeNumber;

    public Employee() {
    }

    public void selection(  )
    {
        System.out.println("press 1 for add");
        System.out.println("press 2 for read");
        System.out.println("press 3 for update");
        System.out.println("press 4 for delete");
        System.out.println("press 5 for out");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
}
