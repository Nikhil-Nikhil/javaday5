package com.labtom;

import java.util.Date;

public class Faculty extends person {
    private String Departmentname;
    private String designation;
    private String Salary;
    private Date Joiningdate;

    public String getDepartmentname() {
        return Departmentname;
    }

    public void setDepartmentname(String departmentname) {
        Departmentname = departmentname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public Date getJoiningdate() {
        return Joiningdate;
    }

    public void setJoiningdate(Date joiningdate) {
        Joiningdate = joiningdate;
    }
}
