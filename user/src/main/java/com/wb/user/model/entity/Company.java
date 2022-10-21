package com.wb.user.model.entity;

import com.wb.user.enums.CompanyType;
import com.wb.user.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "COMPANY")
@Data
public class Company extends BaseEntity {

    @Column(nullable = false)
    private String name;

    private String shortName;

    @Enumerated(EnumType.STRING)
    private CompanyType companyType;

    private String email;
    private String phone;
}
