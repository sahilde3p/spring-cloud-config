package com.initializer.spring.currencyconvertingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.initializer.spring.currencyconvertingservice.bean.ConvertedCurrency;

@RestController
public class CurrencyConvertingService 
{
	@Autowired
	CurrencyExchangeProxy proxy;
	
	
	@GetMapping("/list/from/{from}/to/{to}/quantity/{quantity}")
	public ConvertedCurrency convertedCurrency(@PathVariable("from") String from,@PathVariable("to") String to,@PathVariable double quantity)
	{
		ConvertedCurrency res = proxy.returnRatesUsingFields(from, to);
		return new ConvertedCurrency(res.getFrom(), res.getTo(), res.getExchangeRate(), quantity, quantity*res.getExchangeRate());
		
	}
}
