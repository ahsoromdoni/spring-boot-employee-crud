package com.ahsoromdoni.employeemmi.dao;

import com.ahsoromdoni.employeemmi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
    boolean existsEmployeeByIdNumber(Integer id);
}
