package com.wb.user.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class UserStations extends BaseEntity {
    @ManyToOne
    private User user;
    @ManyToOne
    private Station station;
    private boolean isBaseStation;
    private String timeZone;

    @OneToMany(
            mappedBy = "userStations",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<UserStationRoles> userStationRoles = new ArrayList<>();

}
