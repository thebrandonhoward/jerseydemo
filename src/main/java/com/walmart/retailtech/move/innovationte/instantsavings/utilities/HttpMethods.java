package com.walmart.retailtech.move.innovationte.instantsavings.utilities;

public enum HttpMethods
{
	HTTP_HEAD( "HEAD" ),
	HTTP_OPTIONS( "OPTIONS" ),
	HTTP_GET( "GET" ),
	HTTP_PUT( "PUT" ),
	HTTP_POST( "POST" ),
	HTTP_PATCH( "PATCH" ),
	HTTP_DELETE( "DELETE" );

	private String httpMethod;

	private HttpMethods( String httpmethod )
	{
		httpMethod = httpmethod;
	}

	public String getHttpMethod()
	{
		return httpMethod;
	}
}
