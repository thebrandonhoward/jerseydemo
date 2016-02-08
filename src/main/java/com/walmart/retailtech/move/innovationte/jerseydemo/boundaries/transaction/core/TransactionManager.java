package com.walmart.retailtech.move.innovationte.jerseydemo.boundaries.transaction.core;

import java.util.List;

import javax.ws.rs.core.Response;

public interface TransactionManager
{
	public Response dispatchOptionsTransactionOperations();
	public Response dispatchHeadTransactionOperations();
	public Response dispatchGetTransactionOperations( List<String> requestTransactions
			                                         , int offset 
			                                         , int limit );
	public Response dispatchPutTransactionOperations();
	public Response dispatchPostTransactionOperations();
	public Response dispatchPatchTransactionOperations();
	public Response dispatchDeleteTransactionOperations();
}
