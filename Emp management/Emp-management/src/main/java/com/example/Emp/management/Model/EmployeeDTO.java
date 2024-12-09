package com.example.Emp.management.Model;

public class EmployeeDTO {

    private String name;
    private String email;
    private Long departmentId;
    private Long roleId;
//
//    public EmployeeDTO() {
//    }

    public EmployeeDTO(String name, String email, Long departmentId, Long roleId) {
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
        this.roleId = roleId;
    }

    public EmployeeDTO(String name, String email, String name1, String name2) {
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
