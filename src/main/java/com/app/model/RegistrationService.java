package com.app.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.RegistrationEntity;
import com.app.repo.RegistrationRepo;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepo repo;
	
	public void saveData(RegistrationEntity registration)  {
		repo.save(registration);
	}

	public List<RegistrationEntity> findAllData() {
		List<RegistrationEntity> all = repo.findAll();
		return all;
	}
	 
	public void deleteByID(Integer id) {
		repo.deleteById(id);
	}

	public RegistrationEntity UpdateRegById(Integer id) {
		Optional<RegistrationEntity> byId = repo.findById(id);
		RegistrationEntity registration = byId.get();
		return registration;
		
	}

	public void updateReg(RegistrationEntity registration) {
		repo.save(registration);
	}
	
//	public void getRegById(Integer id) {
//		Optional<RegistrationEntity> byId = repo.findById(id);
//		RegistrationEntity register = byId.get();
//		if(byId.isPresent()) {
//			System.out.println(register.getId());
//			System.out.println(register.getName());
//			System.out.println(register.getEmail());
//			System.out.println(register.getMobile());
//		}else {
//			System.out.println("data is not present");
//		}
	
}
