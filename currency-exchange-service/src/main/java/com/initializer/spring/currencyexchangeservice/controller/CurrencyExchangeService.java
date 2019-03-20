package com.initializer.spring.currencyexchangeservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.initializer.spring.currencyexchangeservice.beans.CurrencyExchange;

@RestController
public class CurrencyExchangeService 
{

	private List<CurrencyExchange> populate()
	{
		List<CurrencyExchange> list = new ArrayList<>();
		list.add(new CurrencyExchange("USD", "INR", 65));
		list.add(new CurrencyExchange("CAD", "INR", 55));
		list.add(new CurrencyExchange("AUD", "INR", 50));
		
		return list;
		
		
	}
	
	@RequestMapping("/list")
	public List<CurrencyExchange> returnRates()
	{
		
		return populate();
		
	}
	
	@RequestMapping("/list/from/{from}/to/{to}")
	public CurrencyExchange returnRatesUsingFields(@PathVariable String from,@PathVariable String to)
	{
		
	return populate().stream().filter(x->x.getFrom().equalsIgnoreCase(from) && x.getTo().equalsIgnoreCase(to)).findAny().get();
		 
	
		
	}
	
}
