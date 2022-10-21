package com.wb.user.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class RolePermissions extends BaseCompositeEntity {

    @EmbeddedId
    private RolePermissionId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("roleId")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("permissionId")
    private Permission permission;

}
