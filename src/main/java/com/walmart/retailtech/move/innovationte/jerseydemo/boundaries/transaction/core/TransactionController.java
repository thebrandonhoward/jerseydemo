package com.walmart.retailtech.move.innovationte.jerseydemo.boundaries.transaction.core;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.walmart.retailtech.move.innovationte.instantsavings.entities.HeaderValidator;
import com.walmart.retailtech.move.innovationte.instantsavings.utilities.HttpMethods;

public interface TransactionController
{
	public HeaderValidator dispatchAuthTransaction( HttpMethods httpMethod
			                                      , HttpHeaders httpHeaders );
	
	public Response dispatchAuthTransactionResponse( boolean isValid
			                                       , HttpMethods httpMethod 
			                                       , Status httpStatus );
} 
