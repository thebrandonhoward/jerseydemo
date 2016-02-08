package com.walmart.retailtech.move.innovationte.jerseydemo.boundaries.utilities;

public interface TransactionHttpMethods
{
	enum TransactionHttpMethod
	{
		HEAD,
		OPTIONS,
		GET,
		PUT,
		POST,
		PATCH,
		DELETE;
	}
	
	public void setHttpMethod( TransactionHttpMethods.TransactionHttpMethod httpMethod );
}
