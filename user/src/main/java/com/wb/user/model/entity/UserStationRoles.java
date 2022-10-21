package com.wb.user.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "USER_STATION_ROLES")
@Data
public class UserStationRoles extends BaseEntity {
    private String status;
    private Long userStationId;
    private Long roleId;
}
