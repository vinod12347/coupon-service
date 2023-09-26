package com.wavelabs.ai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wavelabs.ai.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	public Coupon findByCode(String code);

}
