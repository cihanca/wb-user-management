package com.wb.user.model.entity;

import com.wb.user.enums.ApplicationType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Permission extends BaseEntity {

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private ApplicationType applicationType;

    @ManyToOne
    private Module module;

    @ManyToOne
    private Page page;

}
