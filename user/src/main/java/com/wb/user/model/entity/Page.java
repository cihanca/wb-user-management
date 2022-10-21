package com.wb.user.model.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Page extends BaseEntity {

    private String name;
    private String description;

}
