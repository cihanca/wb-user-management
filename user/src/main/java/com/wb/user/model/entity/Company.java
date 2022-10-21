package com.wb.user.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "COMPANY")
@Data
public class Company extends BaseEntity {
    private String status;

    @Column(nullable = false)
    private String name;

    private String shortName;

    @Column(nullable = false)
    private String companyType;

    private String email;
    private String phone;
}
