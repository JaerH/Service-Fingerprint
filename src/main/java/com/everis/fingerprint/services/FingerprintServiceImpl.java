package com.everis.fingerprint.services;

import com.everis.fingerprint.entities.Fingerprint;
import org.springframework.stereotype.Service;

@Service
public class FingerprintServiceImpl implements IFingerprintService {

	@Override
	public String isFingerprint() {
		
		Fingerprint fingerprint = new Fingerprint("Core");
		System.out.println(fingerprint.toString());
		
		return fingerprint.getEntityname();
	}

}
