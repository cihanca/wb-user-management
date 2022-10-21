package com.wb.user.model.entity;

import com.wb.user.enums.ApplicationType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Entity
@Data
public class Role extends BaseEntity {

    private String status;
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private ApplicationType applicationType;


}
