package com.walmart.retailtech.move.innovationte.instantsavings.entities;

public class Headers 
{
	private String consumerid;
	private String subscriberid;
	private String userid;
	private String password;
	private double version;
	private String token;
	
	public Headers(){}
	
	public String getConsumerid() 
	{
		return consumerid;
	}
	public void setConsumerid(String consumerid) 
	{
		if( !consumerid.equals( null ) &&
		    !consumerid.equals( "" ) )
			this.consumerid = consumerid;
	}
	
	public String getSubscriberid() 
	{
		return subscriberid;
	}
	public void setSubscriberid(String subscriberid) 
	{
		if( !subscriberid.equals( null ) &&
			!subscriberid.equals( "" ) )
		    this.subscriberid = subscriberid;
	}
	
	public String getUserid() 
	{
		return userid;
	}
	public void setUserid(String userid) 
	{
		if( !userid.equals( null ) &&
			!userid.equals( "" ) )
			this.userid = userid;
	}
	
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		if( !password.equals( null ) )
		    this.password = password;
	}
	
	public double getVersion() 
	{
		return version;
	}
	public void setVersion(double version) 
	{
		if( version >= 1.0 )
			this.version = version;
	}
	
	public String getToken() 
	{
		return token;
	}
	public void setToken(String token) 
	{
		if( !token.equals( null ) )
			this.token = token;
	}
	
}
