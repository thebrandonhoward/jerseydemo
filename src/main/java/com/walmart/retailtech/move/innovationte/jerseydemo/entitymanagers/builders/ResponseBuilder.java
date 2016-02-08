package com.walmart.retailtech.move.innovationte.jerseydemo.entitymanagers.builders;

import java.net.URI;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.walmart.retailtech.move.innovationte.instantsavings.utilities.HttpMethods;

public class ResponseBuilder 
{	
	public ResponseBuilder() {}
	
	public Response buildOptions()
	{
		return Response.ok()
					   .header( "Content-Language", "en" )
					   .header( "Access-Control-Allow-Orgin", "*" )
					   .header( "Access-Control-Allow-Methods", "OPTIONS,HEAD,GET,PUT,POST,PATCH,DELETE" )
					   .status( 200 )
					   .build();
	}
	
	public Response buildHeaders()
	{
		return Response.ok()
				       .header( "Content-Language", "en" )
					   .header( "Access-Control-Allow-Orgin", "*" )
					   .header( "Access-Control-Allow-Headers"
							  , "Access-Control-Allow-Headers,Accept,Content-Language,Access-Control-Allow-Origin,subscriberid,consumerid,userid,version,token,password" )
					   .status( 200 )
					   .build();
	}
	
	public Response buildSuccess( String response
			                    , MediaType httpMediaType
			                    , HttpMethods httpMethod 
			                    , Status httpStatus )
	{
		return Response.ok( response, httpMediaType )
				       .header( "Content-Language", "en" )
				       .header( "Access-Control-Allow-Origin", "*" )
			           .header( "Access-Control-Allow-Methods", httpMethod )
			           .status( httpStatus )
			           .build();
	}
	
	public Response buildInvalidRequest( HttpMethods httpMethod
									   , Status httpStatus )
	{
		return Response.serverError()
					   .header( "Content-Language", "en" )
		               .header( "Access-Control-Allow-Origin","*" )
	                   .header( "Access-Control-Allow-Methods", httpMethod )
	                   .status( httpStatus )
	                   .build();
	}

	public Response buildCreatedRequest( HttpMethods httpMethod
	                                    ,Status httpStatus
	                                    ,URI uri )
	{
		return Response.created( uri )
				       .header( "Content-Language", "en" )
		               .header( "Access-Control-Allow-Origin","*" )
		               .header( "Access-Control-Allow-Methods", httpMethod )
		               .status( httpStatus )
		               .build();
	}
}