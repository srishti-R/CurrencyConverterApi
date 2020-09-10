package com.example.converter;

public class ConvertedValue {

	String value;
	
	double convertedValue;

	public ConvertedValue(String value, double convertedValue) {
		super();
		this.value = value;
		this.convertedValue = convertedValue;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public double getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(double convertedValue) {
		this.convertedValue = convertedValue;
	}
	
	
}
