/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Ruhlman
 */
public class Main {
    public static void main(String[] args) {
        Employee myEmployee = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee myEmployee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee myEmployee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        System.out.print(myEmployee.getName() + " ");
        System.out.print(myEmployee.getIdNumber() + " ");
        System.out.print(myEmployee.getDepartment() + " ");
        System.out.print(myEmployee.getPosition() + " \n" );
           
        System.out.print(myEmployee2.getName() + " ");
        System.out.print(myEmployee2.getIdNumber() + " ");
        System.out.print(myEmployee2.getDepartment() + " ");
        System.out.print(myEmployee2.getPosition() + " \n" );
           
        System.out.print(myEmployee3.getName() + " ");
        System.out.print(myEmployee3.getIdNumber() + " ");
        System.out.print(myEmployee3.getDepartment() + " ");
        System.out.print(myEmployee3.getPosition() + " \n" );
    }
}