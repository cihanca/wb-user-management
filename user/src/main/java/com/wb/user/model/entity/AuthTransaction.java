package com.wb.user.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class AuthTransaction extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime lastLoginTime;
    private String transactionId;
    private String clientId;
    @Column(name = "client_ip_address")
    private String clientIPAddress;
    private String username;

}
