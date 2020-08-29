package com.ahsoromdoni.employeemmi.controller;

import com.ahsoromdoni.employeemmi.dto.EmployeeDTO;
import com.ahsoromdoni.employeemmi.entity.Employee;
import com.ahsoromdoni.employeemmi.service.EmployeeService;
import com.ahsoromdoni.employeemmi.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    PositionService positionService;

    @CrossOrigin
    @GetMapping("/page/{page}")
    public Page<Employee> index(@PathVariable Integer page){
        Integer usedPage = page!=null ? page-1 : 0;
        Pageable pageable = PageRequest.of(usedPage, 5);
        return employeeService.getListForPagination(pageable);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public EmployeeDTO addEdit(@PathVariable Integer id){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setPositionList(positionService.getList());
        if(id != 0){
            employeeDTO.setEmployee(employeeService.getById(id));
        }
        return employeeDTO;
    }

    @CrossOrigin
    @PostMapping
    public Employee insert(@RequestBody Employee employee){
        return employeeService.insert(employee);
    }

    @CrossOrigin
    @PutMapping
    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        Employee employee = employeeService.getById(id);
        employeeService.delete(employee);
    }
}
