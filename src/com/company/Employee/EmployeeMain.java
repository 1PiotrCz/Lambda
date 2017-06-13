package com.company.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Piotr Czubkowski on 2017-05-26.
 */
public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Piotr", "Czubkowski", "One"));
        employeeList.add(new Employee("Jan", "Nowak", "One"));
        employeeList.add(new Employee("Adam", "Maliniak", "Two"));
        employeeList.add(new Employee("Henio", "Bienio", "Two"));
        employeeList.add(new Employee("Jan", "Niezbedny", "Three"));
        employeeList.add(new Employee("Olaf", "Jakis", "Five"));
        employeeList.add(new Employee("Bartek", "Bartek", "Four"));
        employeeList.add(new Employee("Zyzio", "Dyzio", "Four"));
        employeeList.add(new Employee("Henio", "Fenio", "Four"));

        Map<String, List<Employee>> groupByCompany = employeeList
                .stream()
                .collect(Collectors.groupingBy(c -> c.getCompany()));
        System.out.println(groupByCompany + "\n");

        groupByCompany.forEach((company, c) -> System.out.println(c));
    }
}
