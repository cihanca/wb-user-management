package com.wb.user.model.entity;

import com.wb.user.enums.Status;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Data
public abstract class BaseCompositeEntity {

    private UUID uid;
    private boolean deleted;
    private Status status;
    private LocalDateTime createDate;
    private String createdBy;
    private LocalDateTime updateDate;
    private String updatedBy;

}
