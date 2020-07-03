package com.webo.app.twowheelerloan.loansanction.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.loansanction.main.model.LoanDetails;
import com.webo.app.twowheelerloan.loansanction.main.service.LoanDetailsService;

@RestController
@CrossOrigin("*")
public class LoanDetailsController {

	@Autowired
	private LoanDetailsService service;
	
	@RequestMapping(value = "/loan")
	public String message() {
		return "Loan Details Works!";
	}
	
	@PostMapping(value = "/addld")
	public String addData(@RequestBody LoanDetails ld) {
		String saved = service.savedata(ld);
		return saved;
	}
	
	@GetMapping(value = "/getld/{id}")
	public LoanDetails getData(@PathVariable("id")int id) {
		LoanDetails ld = service.getDataById(id);
		return ld;
	}
}
