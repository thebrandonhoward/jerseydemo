package com.walmart.retailtech.move.innovationte.jerseydemo.boundaries.transaction.core;

public interface TransactionHeader
{
	public String getConsumerid(); 
	public void setConsumerid( String consumerid );
	
	public String getSubscriberid();
	public void setSubscriberid( String subscriberid );
	
	public String getUserid();
	public void setUserid( String userid );
	
	public String getPassword();
	public void setPassword( String password );
	
	public double getVersion();
	public void setVersion( double version );
	
	public String getToken();
	public void setToken( String token );

}
