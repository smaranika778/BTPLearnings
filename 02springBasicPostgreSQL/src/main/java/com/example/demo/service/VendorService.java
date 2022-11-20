package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Vendor;

@Component
public class VendorService {
	
	//HashMap<String,Vendor> vendors = new HashMap<String,Vendor>();
	@Autowired
	IVendorService iVendor;
	
//	@Autowired
//	Vendor ven1;
//	@Autowired
//	Vendor ven2;
//	@Autowired
//	Vendor ven3;
//	
//	private void fillVendors() {
//			vendors.put("1",ven1);
//			vendors.put("2",ven2);
//			vendors.put("3",ven3);
//	}
//	
//	public VendorService() {
//		fillVendors();
//	}
//	
	public List<Vendor> getAllVendors(){
		List<Vendor> vendors = iVendor.findAll();
		return vendors;
//		fillVendors();
//		return vendors;
	}
	
	public Optional<Vendor> getVendorByKey(String vendorId) {
		return iVendor.findById(vendorId);
//		fillVendors();
//		return vendors.get(vendorId);
	}
	
	public Vendor createVendor(Vendor vendor) {
		return iVendor.save(vendor);
//		fillVendors();
//		return vendors.put("4", vendor);
	}
	
	public Vendor updateVendor(Vendor vendor) {
		
		String code = vendor.getCode();
		 Optional<Vendor> searchedVendor = iVendor.findById(code);
		 if(!searchedVendor.isPresent()) {
			 return new Vendor();
		 }
		 return iVendor.save(vendor);
		
		
		
//		fillVendors();
//		return vendor;
	}
//	
	public List<Vendor> searchByCompanyName(String company){
		return iVendor.findBycompanyName(company);
	}
	public void deleteVendor(String vendorId) {
		iVendor.deleteById(vendorId);
//			 vendors.remove(vendorId);	
	}
	}
