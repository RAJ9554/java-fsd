package com.mAadhar.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mAadhar.bean.Aadhar;
import com.mAadhar.repository.AadharRepository;

@Service
public class AadharService {
	@Autowired
	AadharRepository aadharRepository;
	
	public String storeAadhar(Aadhar aadhar) {
		aadharRepository.save(aadhar);
		return "Aadhar Details Submitted Succesfully";
	}
	public List<Aadhar> getAllAadhar(){
		return aadharRepository.findAll();
	}
	public String findAadharById(int cid) {
		Optional<Aadhar> result = aadharRepository.findById(cid);
		if(result.isPresent()) {
			Aadhar a = result.get();
			return a.toString();
		}else {
			return "Aadhar Details not found";
		}
	}
	public String deleteAadhar(int cid) {
		Optional<Aadhar> result = aadharRepository.findById(cid);
		if(result.isPresent()) {
			Aadhar a = result.get();
			aadharRepository.delete(a);
			return "Aadhar Deleted Succesfully";
		}else {
			return "Aadhar details didn't match with record";
		}
	}
	public String updateAadhar(Aadhar aadhar) {
		Optional<Aadhar> result = aadharRepository.findById(aadhar.getCid());
		if(result.isPresent()) {
			Aadhar a = result.get();
			a.setCname(aadhar.getCname());
			a.setAddress(aadhar.getAddress());
			a.setDob(aadhar.getDob());
			a.setEmailid(aadhar.getEmailid());
			a.setNumber(aadhar.getNumber());
			aadharRepository.saveAndFlush(a);
			return "Aadhar Details Updated Succesfully";
		}else {
			return "Aadhar details not present";
		}
	}

}
