package com.walmart.retailtech.move.innovationte.jerseydemo.boundaries.transaction.core;

import java.util.regex.PatternSyntaxException;

import javax.naming.ConfigurationException;

public interface TransactionDatastoreConnection 
{
	public void datastoreStartup() throws ConfigurationException, PatternSyntaxException;
	public void datastoreShutdown();
}
