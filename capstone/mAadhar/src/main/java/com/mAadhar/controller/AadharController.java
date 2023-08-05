package com.mAadhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mAadhar.bean.Aadhar;
import com.mAadhar.service.AadharService;



@RestController
@RequestMapping("aadhar")
@CrossOrigin(origins="*")
public class AadharController {
	@Autowired
	AadharService aadharService;
	
	@PostMapping(value = "storeAadhar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeAadhar(@RequestBody Aadhar aadhar) {
		return aadharService.storeAadhar(aadhar);
	}
	@PatchMapping(value = "updateAadhar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateAadhar(@RequestBody Aadhar aadhar) {
		return aadharService.updateAadhar(aadhar);
	}
	@GetMapping(value = "findAllAadhar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Aadhar> getAllAadhar(){
		return aadharService.getAllAadhar();
	}
	@GetMapping(value = "findAllAadhar/{cid}")
	public String findAadharById(@PathVariable("cid") int cid) {
		return aadharService.findAadharById(cid);
	}
	@DeleteMapping(value = "deleteAadhar/{cid}")
	public String deleteAadharUsingId(@PathVariable("cid") int cid) {
		return aadharService.deleteAadhar(cid);
	}

}
