package com.wb.user.model.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UserStationRolesId implements Serializable {

    private Long roleId;

    private Long userStationId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserStationRolesId that = (UserStationRolesId) o;
        return roleId.equals(that.roleId) && userStationId.equals(that.userStationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, userStationId);
    }
}
