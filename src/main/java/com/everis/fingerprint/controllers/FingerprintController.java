package com.everis.fingerprint.controllers;

import com.everis.fingerprint.services.IFingerprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FingerprintController {
	
	@Autowired
	private IFingerprintService iFingerprintService;

	@GetMapping("/core/fingerprints/validate")
	public String getNameEntity() {
		return iFingerprintService.isFingerprint();
		
	}
	

}
