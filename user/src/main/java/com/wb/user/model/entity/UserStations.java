package com.wb.user.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class UserStations extends BaseEntity {
    private String status;
    private Long userId;
    @ManyToOne
    private Station station;
    private boolean isBaseStation;
    private String timeZone;
}
