package com.wb.user.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Contracts extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    private Company airline;
    @ManyToOne(fetch = FetchType.LAZY)
    private Station station;
    @ManyToOne(fetch = FetchType.LAZY)
    private Company handler;
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
}
