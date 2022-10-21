package com.wb.user.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "USER_STATION_ROLES")
@Data
public class UserStationRoles extends BaseCompositeEntity {

    @EmbeddedId
    private UserStationRolesId id;

    @ManyToOne
    @MapsId("userStationId")
    private UserStations userStations;

    @ManyToOne
    @MapsId("roleId")
    private Role roles;

}
