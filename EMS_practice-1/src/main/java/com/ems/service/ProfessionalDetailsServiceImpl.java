package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.ProfessionalDetails;
import com.ems.repository.ProfessionalDetailsRepository;

@Service
public class ProfessionalDetailsServiceImpl implements ProfessionalDetailsService {
	
	@Autowired
	private ProfessionalDetailsRepository professionalDetailsRepository;
	
	@Override
	public ProfessionalDetails saveProfessionalDetails(ProfessionalDetails professionalDetails) {
		// TODO Auto-generated method stub
		return professionalDetailsRepository.save(professionalDetails);
	}

}
