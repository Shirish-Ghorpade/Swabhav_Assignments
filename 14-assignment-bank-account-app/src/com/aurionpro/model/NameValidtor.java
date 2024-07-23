package com.aurionpro.model;

public class NameValidtor {
	public boolean checkBasicValidation(String str, int lower, int upper) {
		if (str == null || str == "" || str.length() < lower || str.length() > upper) {
			return false;
		}
		return true;
	}

//	public boolean validateUserName(String userName) {
//		if(checkBasicValidation(userName, 2, 30)) {
//			
//		}
//	}
}
