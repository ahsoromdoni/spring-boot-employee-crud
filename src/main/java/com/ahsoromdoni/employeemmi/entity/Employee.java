package com.ahsoromdoni.employeemmi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T2_EMPLOYEE")
@Getter @Setter @EqualsAndHashCode
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @JsonFormat(pattern = "YYYY-mm-DD")
    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Column(name = "ID_NUMBER")
    private Integer idNumber;

    @Column(name = "GENDER")
    private Integer gender;

    @Column(name = "IS_DELETE")
    private Integer isDelete;
}
