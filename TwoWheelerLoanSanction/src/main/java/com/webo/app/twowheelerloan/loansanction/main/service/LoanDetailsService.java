package com.webo.app.twowheelerloan.loansanction.main.service;

import com.webo.app.twowheelerloan.loansanction.main.model.LoanDetails;

public interface LoanDetailsService {

	String savedata(LoanDetails ld);

	LoanDetails getDataById(int id);

}
