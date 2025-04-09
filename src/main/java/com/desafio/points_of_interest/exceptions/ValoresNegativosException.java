package com.desafio.points_of_interest.exceptions;

public class ValoresNegativosException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ValoresNegativosException(String message) {
		super(message);
	}
}
