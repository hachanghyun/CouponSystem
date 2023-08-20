package com.example.api.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coupon {

    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long couponType;

    public Coupon() {
    }

    public Coupon(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }
}
