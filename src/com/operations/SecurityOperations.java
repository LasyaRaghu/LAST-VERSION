package com.operations;

import java.util.List;

import com.beans.Security;

public interface SecurityOperations {
	 List<Security> displayBorrowingRate();
	 
	 Security getSecurityName(String securityId);

	String getSecurityId(String securityName);

}
