package com.initializer.spring.currencyconvertingservice.bean;

public class ConvertedCurrency 
{
	private String from;
	private String to;
	private double exchangeRate;
	private double quantity;
	private double finalRate;
	
	ConvertedCurrency (){
		
	}
	
	
	public ConvertedCurrency(String from, String to, double exchangeRate, double quantity, double finalRate) {
		super();
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
		this.quantity = quantity;
		this.finalRate = finalRate;
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
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getFinalRate() {
		return finalRate;
	}
	public void setFinalRate(double finalRate) {
		this.finalRate = finalRate;
	}
	
	
}
