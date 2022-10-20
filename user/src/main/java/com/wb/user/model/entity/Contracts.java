package com.wb.user.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Contracts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID uid;
    private boolean deleted;
    private String status;
    private Long airlineId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "station_id")
    private Station station;
    private Long handlerId;
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
    private LocalDateTime createDate;
    private String createdBy;
    private LocalDateTime updateDate;
    private String updatedBy;
}
