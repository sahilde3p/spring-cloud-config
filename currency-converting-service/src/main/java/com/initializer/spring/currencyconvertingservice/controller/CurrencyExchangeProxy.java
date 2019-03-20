package com.initializer.spring.currencyconvertingservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.initializer.spring.currencyconvertingservice.bean.ConvertedCurrency;

@FeignClient(name="currency-exchange-service", url="localhost:8000")
public interface CurrencyExchangeProxy {

	@RequestMapping("/list/from/{from}/to/{to}")
	public ConvertedCurrency returnRatesUsingFields(@PathVariable("from") String from,@PathVariable("to") String to);
}
