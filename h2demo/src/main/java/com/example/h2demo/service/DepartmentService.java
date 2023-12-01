package com.example.h2demo.service;

import com.example.h2demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> fetchDepartmentList();
    Department updateDepartment(Department department, Long departmentId);
    void deleteDepartment(Long departmentId);
}
