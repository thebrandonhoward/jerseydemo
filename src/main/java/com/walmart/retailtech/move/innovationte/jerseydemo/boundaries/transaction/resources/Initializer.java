package com.walmart.retailtech.move.innovationte.jerseydemo.boundaries.transaction.resources;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

public interface Initializer
{
	//OPTIONS
	public Response getOptions( HttpHeaders httpHeaders );
	
	//HEAD
	public Response getHead( HttpHeaders httpHeaders );
	
	//GET
	public Response getAll( HttpHeaders httpHeaders
                          , List<String> requestTransactions 
                          , int offset
                          , int limit );
	
	public Response getByIdentifier( HttpHeaders httpHeaders
                                   , String resourceIdentifier
                                   , int offset
                                   , int limit );
	
	//PUT
	public Response putAll( HttpHeaders httpHeaders
            			  , List<String> transactionBody 
                          , int offset
                          , int limit );
	public Response putByIdentifier( HttpHeaders httpHeaders 
								   , String identifier
								   , String transactionBody
								   , int offset
                                   , int limit );
	
	//POST
	public Response postAll( HttpHeaders httpHeaders
			               , List<String> transactionBody 
                           , int offset
                           , int limit );
	public Response postByIdentifier( HttpHeaders httpHeaders 
					                , String identifier
					                , String transactionBody
					                , int offset
                                    , int limit );
	
	//PATCH
	public Response patchAll( HttpHeaders httpHeaders
            				, List<String> transactionBody 
            				, int offset
            				, int limit );
	public Response patchByIdentifier( HttpHeaders httpHeaders 
		                			 , String identifier
		                             , String transactionBody
		                             , int offset
                                     , int limit );
	
	//DELETE
	public Response deleteAll( HttpHeaders httpHeaders
                             , List<String> transactionBody 
                             , int offset
                             , int limit );
	public Response deleteByIdentifier( HttpHeaders httpHeaders 
	                				  , String identifier
	                				  , String transactionBody
	                				  , int offset
	                				  , int limit );
	
}
