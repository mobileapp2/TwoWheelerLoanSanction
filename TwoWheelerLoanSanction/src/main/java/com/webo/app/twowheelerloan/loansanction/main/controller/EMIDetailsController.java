package com.webo.app.twowheelerloan.loansanction.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class EMIDetailsController {

	@RequestMapping(value = "/emi")
	public String message() {
		return "EMI Details works!";
	}
}
