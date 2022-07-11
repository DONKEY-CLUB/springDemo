package com.donkeyclub.labspace.service;

import com.donkeyclub.labspace.entity.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> fetchDepartmentList();

    public Department saveDepartment(Department department);

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);
}
