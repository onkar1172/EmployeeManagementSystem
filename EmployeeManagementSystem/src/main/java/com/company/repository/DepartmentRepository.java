package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.model.Department;
import com.company.model.Employee;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
 
}
