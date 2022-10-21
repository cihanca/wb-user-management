package com.wb.user.model.entity;

import com.wb.user.enums.ApplicationType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Role extends BaseEntity {

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private ApplicationType applicationType;

    @ManyToOne
    private Module module;

    @ManyToOne
    private Page page;

    @OneToMany(
            mappedBy = "role",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<RolePermissions> rolePermissions = new ArrayList<>();


}
