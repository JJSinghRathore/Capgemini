package com.cg.groupBy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employee_table")
@Data
public class Employee {
    @Id
    private int eid;
    private String name;
    private String dept;
}
