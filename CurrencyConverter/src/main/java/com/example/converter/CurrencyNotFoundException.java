package com.example.converter;

public class CurrencyNotFoundException extends RuntimeException {
	QueryObject obj;

	public CurrencyNotFoundException(QueryObject obj) {
		super(obj.type + " or " + obj.value + " is not valid.");
		this.obj = obj;
	}

}
