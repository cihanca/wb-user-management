package com.wb.user.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Contracts extends BaseEntity {
    private String status;
    private Long airlineId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "station_id")
    private Station station;
    private Long handlerId;
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
}
