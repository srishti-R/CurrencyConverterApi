package com.example.converter;

public class QueryObject {
	double value;
	String type;
	
	public QueryObject(int value, String type) {
	this.value=value;
	this.type=type;
	}

	public double getValue() {
		return value;
	}



	public void setValue(double value) {
		this.value = value;
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
