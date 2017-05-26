package com.company.Employee;

/**
 * Created by Piotr Czubkowski on 2017-05-26.
 */
public class Employee {

    private String firstname;
    private String lastName;
    private String company;

    public Employee(String firstname, String lastName, String company) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.company = company;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
