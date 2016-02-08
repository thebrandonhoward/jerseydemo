package com.walmart.retailtech.move.innovationte.instantsavings.interactors.managers;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import com.walmart.retailtech.move.innovationte.instantsavings.entities.HeaderValidator;
import com.walmart.retailtech.move.innovationte.instantsavings.interactors.controllers.SecurityController;
import com.walmart.retailtech.move.innovationte.instantsavings.utilities.HttpMethods;
import com.walmart.retailtech.move.innovationte.jerseydemo.boundaries.transaction.core.TransactionController;
import com.walmart.retailtech.move.innovationte.jerseydemo.boundaries.transaction.core.TransactionManager;
import com.walmart.retailtech.move.innovationte.jerseydemo.entitymanagers.builders.ResponseBuilder;

public class InitializerManager
	implements TransactionManager
{
	private HttpHeaders httpHeaders;
	private HeaderValidator headerValidatorObject;
	private TransactionController transactionController;
	
	@SuppressWarnings( "unused" )
	private InitializerManager(){};
	
	public InitializerManager( HttpHeaders httpHeaders )
	{
		this.httpHeaders = httpHeaders;
	};
	
	@Override
	public Response dispatchOptionsTransactionOperations()
	{
		transactionController = new SecurityController();
		
		headerValidatorObject 
			= transactionController.dispatchAuthTransaction( HttpMethods.HTTP_OPTIONS
														   , httpHeaders );
		
		return transactionController
				.dispatchAuthTransactionResponse( headerValidatorObject.isValid()
				                                , HttpMethods.HTTP_OPTIONS
				                                , headerValidatorObject.getHttpStatus() );
	}

	@Override
	public Response dispatchHeadTransactionOperations()
	{
		transactionController = new SecurityController();
		
		headerValidatorObject 
			= transactionController.dispatchAuthTransaction( HttpMethods.HTTP_HEAD
														   , httpHeaders );
		
		return transactionController
				.dispatchAuthTransactionResponse( headerValidatorObject.isValid()
				                                , HttpMethods.HTTP_HEAD
				                                , headerValidatorObject.getHttpStatus() );
	}

	@Override
	public Response dispatchGetTransactionOperations(List<String> requestTransactions, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response dispatchPutTransactionOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response dispatchPostTransactionOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response dispatchPatchTransactionOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response dispatchDeleteTransactionOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
