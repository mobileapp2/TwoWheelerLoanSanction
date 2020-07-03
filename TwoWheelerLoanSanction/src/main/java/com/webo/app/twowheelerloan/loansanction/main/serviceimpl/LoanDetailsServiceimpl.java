package com.webo.app.twowheelerloan.loansanction.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loansanction.main.model.LoanDetails;
import com.webo.app.twowheelerloan.loansanction.main.repository.LoanDetailsRepository;
import com.webo.app.twowheelerloan.loansanction.main.service.LoanDetailsService;

@Service
public class LoanDetailsServiceimpl implements LoanDetailsService {
	
	@Autowired
	private LoanDetailsRepository repo;

	@Override
	public String savedata(LoanDetails ld) {
		String saved = "";
		if(repo.save(ld) != null) {
			saved = "Data saved";
		}else {
			saved = "Data is not saved";
		}
		return saved;
	}

	@Override
	public LoanDetails getDataById(int id) {
		return repo.findById(id).get();
	}

}
