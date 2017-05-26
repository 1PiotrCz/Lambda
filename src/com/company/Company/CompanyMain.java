package com.company.Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Piotr Czubkowski on 2017-05-26.
 */
public class CompanyMain {
    public static void main(String[] args) {

        List<Company> companyList = new ArrayList<>();
        companyList.add(new Company("One", "Warsaw"));
        companyList.add(new Company("Two", "Warsaw"));
        companyList.add(new Company("three", "Olsztyn"));
        companyList.add(new Company("four", "Olsztyn"));
        companyList.add(new Company("five", "Poznan"));
        companyList.add(new Company("six", "Warsaw"));

        Map<String, List<Company>> groupByName = companyList
                .stream()
                .collect(Collectors.groupingBy(o -> o.getName()));

        groupByName.forEach((a, b) -> System.out.println(a));

    }
}
