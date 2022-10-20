package com.wb.user.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID uid;
    private boolean deleted;
    private String status;
    private String name;
    private String shortName;
    private String timeZone;
    private LocalDateTime createDate;
    private String createdBy;
    private LocalDateTime updateDate;
    private String updatedBy;
}
