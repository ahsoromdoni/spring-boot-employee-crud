package com.ahsoromdoni.employeemmi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T2_EMPLOYEE")
@Getter @Setter @EqualsAndHashCode
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    @JsonFormat(pattern = "YYYY-mm-DD")
    private Date birthDate;
    @ManyToOne
    @JoinColumn(name = "POSITION_ID")
    @JsonIgnoreProperties(value = {"code","isDelete"})
    private Position position;
    private Integer idNumber;
    private Integer gender;
    private Integer isDelete;
    @Transient
    private Integer positionId;
}
