package com.ahsoromdoni.employeemmi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T1_POSITION")
@Getter @Setter @EqualsAndHashCode
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    private Integer isDelete;
    @OneToMany(mappedBy = "position")
    @JsonIgnore
    private List<Employee> employeeList = new ArrayList<>();
}
