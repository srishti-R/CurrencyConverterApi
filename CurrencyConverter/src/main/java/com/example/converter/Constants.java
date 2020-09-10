package com.example.converter;

public class Constants {
	public final static double USDF=0.0134045;
	public final static double GNFF=131.46; //Guinea franc
	public final static double RUBF=1.03; //Russian ruble
	public final static double CADF=0.02; //Canadian dollar
	public final static double JPYF=1.45; //Japanese Yen
	

	public static double getConversionFactor(QueryObject obj) {
		double factor=0;
		switch(obj.type) {
		case "USD": factor= USDF;
		break;
		case "GNF": factor=GNFF;
		break;
		case "RUB": factor=RUBF;
		break;
		case "CAD": factor=CADF;
		break;
		case "JPY": factor=JPYF;
		break;
		default: throw new CurrencyNotFoundException(obj);
		}
		return factor;
	}
}
