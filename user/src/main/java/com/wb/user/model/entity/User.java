package com.wb.user.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "USER")
@Data
public class User extends BaseEntity {
    private String status;

    @Column(unique = true, nullable = false)
    private String staffId;

    private String username;
    private String name;
    private String surname;
    private String phone;
    private String email;

    @Column(nullable = false)
    private String userType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airline_id")
    private Company airline;
}
