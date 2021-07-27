package com.company.Company;

public class Employee extends Person {

    // Define the attributes of an employee.
    private String companyId;
    private String companyName;

    // Define the constructor

    public Employee(String name, int age, String companyId, String companyName) {
        super(name, age);
        this.companyId = companyId;
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
