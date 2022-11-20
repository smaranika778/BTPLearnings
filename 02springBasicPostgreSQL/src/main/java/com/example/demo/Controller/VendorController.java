package com.example.demo.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Vendor;
import com.example.demo.service.VendorService;

@RestController
public class VendorController {
	
	@Autowired
	VendorService vendorService;
	
	@RequestMapping("/vendor")
	public List<Vendor> getAllVendors(){
		return vendorService.getAllVendors();
	}
	
	@RequestMapping("/vendor/{vendorId}")
	public Optional<Vendor> getVendorbyKey(@PathVariable("vendorId") String vendorId1) {
		return vendorService.getVendorByKey(vendorId1);
	}
	
	@PostMapping("/vendor")
	public Vendor createVendor(@RequestBody Vendor myVendor) {
		return vendorService.createVendor(myVendor);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/vendor")
	public Vendor updateVendor(@RequestBody Vendor myVendor) {
		 return vendorService.updateVendor(myVendor);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/vendor/{vendorId}")
	public void deleteVendor(@PathVariable ("vendorId") String vendorId1) {
		vendorService.deleteVendor(vendorId1);
	}
	
	@RequestMapping("/vendor/search")
	public List<Vendor> searchByCompanyName(String companyName){
		return vendorService.searchByCompanyName(companyName);
	}
	

}
