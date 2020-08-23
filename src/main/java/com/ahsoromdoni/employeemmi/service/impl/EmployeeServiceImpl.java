package com.ahsoromdoni.employeemmi.service.impl;

import com.ahsoromdoni.employeemmi.dao.EmployeeDAO;
import com.ahsoromdoni.employeemmi.entity.Employee;
import com.ahsoromdoni.employeemmi.entity.Position;
import com.ahsoromdoni.employeemmi.exception.BadRequestException;
import com.ahsoromdoni.employeemmi.exception.NotFoundException;
import com.ahsoromdoni.employeemmi.service.EmployeeService;
import com.ahsoromdoni.employeemmi.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    @Autowired
    PositionService positionService;

    @Override
    public Employee insert(Employee entity) {
        if (employeeDAO.existsEmployeeByIdNumber(entity.getIdNumber())){
            throw new BadRequestException("NIP was using by another employee. Please insert another NIP");
        }
        entity.setPosition(positionService.getById(entity.getPositionId()));
        return employeeDAO.save(entity);
    }

    @Override
    public Employee update(Employee entity) {
        Boolean isSame = false;
        if(!employeeDAO.findById(entity.getId()).isPresent()){
            throw new NotFoundException("Id not found!");
        }

        isSame = employeeDAO.findById(entity.getId()).get().getIdNumber().equals(entity.getIdNumber());

        if (!isSame && employeeDAO.existsEmployeeByIdNumber(entity.getIdNumber())){
            throw new BadRequestException("NIP was using by another employee. Please insert another NIP");
        }

        entity.setPosition(positionService.getById(entity.getPositionId()));
        return employeeDAO.save(entity);
    }

    @Override
    public void delete(Employee entity) {
        employeeDAO.delete(entity);
    }

    @Override
    public Employee getById(Integer id) {
        if(!employeeDAO.findById(id).isPresent()){
            throw new NotFoundException("Id not found!");
        }
        return employeeDAO.findById(id).get();
    }

    @Override
    public List<Employee> getList() {
        return employeeDAO.findAll();
    }

    @Override
    public Page<Employee> getListForPagination(Pageable pager) {
        return employeeDAO.findAll(pager);
    }
}
