package com.company.Company;

import java.util.List;


public class Company {
    // Define the attributes of the Company
    private List<Employee> employee;
    private String companyName;

    public Company(List<Employee> employee, String companyName) {
        this.employee = employee;
        this.companyName = companyName;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public float getAverageAge() {
        float sum = 0;

        for(Employee employee : this.employee) {
            sum += employee.getAge();
        }
        return sum / this.employee.size();
    }
}
