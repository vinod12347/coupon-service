package com.wavelabs.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wavelabs.ai.model.Coupon;
import com.wavelabs.ai.repository.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponController {
	
	@Autowired
	private CouponRepo couponRepo;
	
	@RequestMapping(value = "/coupons")
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		return couponRepo.save(coupon);
	}
	
	@RequestMapping(value = "/coupons/{code}")
	public Coupon findCoupon(@PathVariable(required = true,name = "code")String  code) {
		return couponRepo.findByCode(code);
	}

}
