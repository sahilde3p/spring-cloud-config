package com.initializer.spring.currencyexchangeservice.beans;

public class CurrencyExchange
{
	
	private String from;
	private String to;
	private double exchangeRate;
	
	CurrencyExchange(){
		
	}

	public CurrencyExchange(String from, String to, double exchangeRate) {
		super();
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	
	

}
