package com.wb.user.model.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Permission extends BaseEntity {

    private String status;
    private String name;
    private String description;

}
