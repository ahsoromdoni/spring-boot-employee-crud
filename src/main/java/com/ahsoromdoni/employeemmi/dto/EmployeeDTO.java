package com.ahsoromdoni.employeemmi.dto;

import com.ahsoromdoni.employeemmi.entity.Employee;
import com.ahsoromdoni.employeemmi.entity.Position;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDTO {
    private List<Position> positionList = new ArrayList<>();
    private Employee employee;

    public List<Position> getPositionList() {
        return positionList;
    }

    public void setPositionList(List<Position> positionList) {
        this.positionList = positionList;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
