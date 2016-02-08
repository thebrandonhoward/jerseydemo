package com.walmart.retailtech.move.innovationte.instantsavings.entities;

import javax.ws.rs.core.Response.Status;

public class HeaderValidator
{
	
	private boolean isValid;
	private Status httpStatus;

	public boolean isValid()
	{
		return isValid;
	}

	public void setValid( boolean isValid )
	{
		this.isValid = isValid;
	}

	public Status getHttpStatus()
	{
		return httpStatus;
	}

	public void setHttpStatus( Status httpStatus )
	{
		this.httpStatus = httpStatus;
	}
	
}
