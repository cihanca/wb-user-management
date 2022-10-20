package com.wb.user.model.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Station extends BaseEntity {
    private String status;
    private String name;
    private String shortName;
    private String timeZone;
}
