package com.walmart.retailtech.move.innovationte.instantsavings.utilities;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response.Status;

import com.walmart.retailtech.move.innovationte.instantsavings.entities.HeaderValidator;
import com.walmart.retailtech.move.innovationte.instantsavings.entities.Headers;
import com.walmart.retailtech.move.innovationte.jerseydemo.entitymanagers.builders.HeadersBuilder;

public class HeadersValidatorUtility 
{
	private HttpMethods httpMethod;
	private HttpHeaders httpHeaders;
	private Headers headers;
	
	@SuppressWarnings("unused")
	private HeadersValidatorUtility() {};

	public HeadersValidatorUtility( HttpMethods httpMethod
			                      , HttpHeaders httpHeaders )
	{
		this.httpMethod = httpMethod;
		this.httpHeaders = httpHeaders;
	}
	
	public HeaderValidator validateHeaders()
	{
		HeaderValidator headerValidator = new HeaderValidator();
		
		Boolean validHeaders = validateHeadersKeys( httpHeaders );
		
		if( validHeaders )
		{
			headers = new HeadersBuilder().constructHeaders( httpHeaders );
			
			// VALIDATE NECESSARY HEADER VALUES
			if(   headers.getConsumerid().equals( "" )   
			   || headers.getSubscriberid().equals( "" ) 
		       || headers.getUserid().equals( "" ) )
			{
				headerValidator.setHttpStatus( Status.BAD_REQUEST );
			    return headerValidator;
			}
		
			// ONE OR THE OTHER, OR BOTH
			if(   headers.getToken().equals( "" )  
			   && headers.getPassword().equals( "" ) )
			{
				headerValidator.setHttpStatus( Status.BAD_REQUEST );
				return headerValidator;
			}
		}
		
		headerValidator.setHttpStatus( Status.OK );
		headerValidator.setValid( true );
		return headerValidator;
	}
	
	private boolean validateHeadersKeys( HttpHeaders headers )
	{
		// NOT OPTIONS OR HEAD, WITH ALL HEADER VALUES
		if(  !httpMethod.equals( HttpMethods.HTTP_HEAD )
		  && !httpMethod.equals( HttpMethods.HTTP_OPTIONS )
		  && headers.getRequestHeaders().containsKey( "consumerid" ) 
		  && headers.getRequestHeaders().containsKey( "subscriberid" )
		  && headers.getRequestHeaders().containsKey( "userid" )
		  && headers.getRequestHeaders().containsKey( "password" )
		  && headers.getRequestHeaders().containsKey( "version" )
		  && headers.getRequestHeaders().containsKey( "token" ) )
			return true;
		
		// OPTIONS OR HEAD, WITH NEEDED HEADER VALUES
		if(  httpMethod.equals( HttpMethods.HTTP_HEAD )
		  || httpMethod.equals( HttpMethods.HTTP_OPTIONS )
		  && headers.getRequestHeaders().containsKey( "consumerid" ) 
	      && headers.getRequestHeaders().containsKey( "subscriberid" ) )
		    return true;		
		
		return false;
	}
	
}
