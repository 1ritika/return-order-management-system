package com.cts.authorization.model;

import java.io.Serializable;
public class JwtResponseToken implements Serializable {

	private static final long serialVersionUID = 8317676219297719109L;

	private final String token;

	public JwtResponseToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}
}