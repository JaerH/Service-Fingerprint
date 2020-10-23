package com.everis.fingerprint.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Fingerprint {

	private String entityname;
	private final Boolean success = true;
}
