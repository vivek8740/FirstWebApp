package com.oracle.service;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Oracle") && password.equals("NextGen");
	}

}
