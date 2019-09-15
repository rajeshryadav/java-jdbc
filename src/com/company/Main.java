package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Employee employee=new Employee();
        Scanner sc=new Scanner(System.in);
        employee.selection();
        int caseSelection=sc.nextInt();

        boolean b=true;
        while (b){

            switch (caseSelection){
                case 1:
                    System.out.println("Please enter first name");
                    System.out.println("Please enter last name");
                    System.out.println("Please enter address");
                    System.out.println("Please enter empId");
                    Scanner scanner=new Scanner(System.in);
                    String fName=scanner.nextLine();
                    employee.setFirstName(fName);

                    String lName=scanner.nextLine();
                    employee.setLastName(lName);

                    String address=scanner.nextLine();
                    employee.setAddress(address);

                    int empNO=scanner.nextInt();
                    employee.setEmployeeNumber(empNO);


                    String query = "INSERT INTO employee values('" + employee.getFirstName() + "','" + employee.getLastName() + "','" + employee.getAddress()+ "','" +
                            employee.getEmployeeNumber() +"')";

                    JdbcPersistance.save(query);
                case 2:
                case 3:
                case 4:
                case 5:
                    b=false;
                break;
            }
        }

    }
}
