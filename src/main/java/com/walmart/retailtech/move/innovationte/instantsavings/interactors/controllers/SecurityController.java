package com.walmart.retailtech.move.innovationte.instantsavings.interactors.controllers;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.walmart.retailtech.move.innovationte.instantsavings.entities.HeaderValidator;
import com.walmart.retailtech.move.innovationte.instantsavings.utilities.HeadersValidatorUtility;
import com.walmart.retailtech.move.innovationte.instantsavings.utilities.HttpMethods;
import com.walmart.retailtech.move.innovationte.jerseydemo.boundaries.transaction.core.TransactionController;
import com.walmart.retailtech.move.innovationte.jerseydemo.entitymanagers.builders.ResponseBuilder;

public class SecurityController
	implements TransactionController
{
	
	@Override
	public HeaderValidator dispatchAuthTransaction( HttpMethods httpMethod
			                                      , HttpHeaders httpHeaders )
	{
		HeadersValidatorUtility headersValidatorUtility
			= new HeadersValidatorUtility( httpMethod
					                     , httpHeaders );
		
		HeaderValidator headerValidator = headersValidatorUtility.validateHeaders();
		
		return headerValidator;
	}
	
	@Override
	public Response dispatchAuthTransactionResponse( boolean isValid
												   , HttpMethods httpMethod 
												   , Status httpStatus )
	{	
		ResponseBuilder responseBuilder = new ResponseBuilder();
		
		if( isValid )
		{
			switch( httpMethod )
			{
				case HTTP_HEAD : 
					return responseBuilder.buildHeaders();
				case HTTP_OPTIONS :
					return responseBuilder.buildOptions();
				default:
					return responseBuilder.buildInvalidRequest( httpMethod
                                                              , httpStatus );
			}
		}
		return responseBuilder.buildInvalidRequest( httpMethod
					                              , httpStatus );

	}
}