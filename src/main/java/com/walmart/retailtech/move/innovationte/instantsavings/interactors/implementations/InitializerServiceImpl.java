package com.walmart.retailtech.move.innovationte.instantsavings.interactors.implementations;

import java.util.List;

import javax.ws.rs.*;

import javax.ws.rs.core.*;

import com.hubspot.jackson.jaxrs.*;

import com.walmart.retailtech.move.innovationte.instantsavings.interactors.managers.InitializerManager;
import com.walmart.retailtech.move.innovationte.jerseydemo.boundaries.transaction.core.TransactionManager;
import com.walmart.retailtech.move.innovationte.jerseydemo.boundaries.transaction.resources.Initializer;

@Path( "/" )
@Consumes( MediaType.APPLICATION_JSON )
@Produces( MediaType.APPLICATION_JSON )
public class InitializerServiceImpl
	implements Initializer
{ 
	private static final String JSON = MediaType.APPLICATION_JSON;
	private TransactionManager transactionManager;

	@OPTIONS
	@Path( "/" )
	@PropertyFiltering
	@Produces( JSON )
	@Override
	public Response getOptions( @Context HttpHeaders httpHeaders )
	{	
		transactionManager = new InitializerManager( httpHeaders);
		
		return transactionManager.dispatchOptionsTransactionOperations();
	}

	@HEAD
	@Path( "/" )
	@PropertyFiltering
	@Produces( JSON )
	@Override
	public Response getHead( @Context HttpHeaders httpHeaders )
	{
		transactionManager = new InitializerManager( httpHeaders );
		
		return transactionManager.dispatchHeadTransactionOperations();
	}

	@Override
	public Response getAll( HttpHeaders httpHeaders
						  , List<String> requestTransactions
						  , int offset
						  , int limit)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getByIdentifier(HttpHeaders httpHeaders, String resourceIdentifier, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response putAll(HttpHeaders httpHeaders, List<String> transactionBody, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response putByIdentifier(HttpHeaders httpHeaders, String identifier, String transactionBody, int offset,
			int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response postAll(HttpHeaders httpHeaders, List<String> transactionBody, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response postByIdentifier(HttpHeaders httpHeaders, String identifier, String transactionBody, int offset,
			int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response patchAll(HttpHeaders httpHeaders, List<String> transactionBody, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response patchByIdentifier(HttpHeaders httpHeaders, String identifier, String transactionBody, int offset,
			int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deleteAll(HttpHeaders httpHeaders, List<String> transactionBody, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deleteByIdentifier(HttpHeaders httpHeaders, String identifier, String transactionBody, int offset,
			int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
