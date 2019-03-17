package com.sahil.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController 
{
	@Autowired
	ConfProperties props;

	@GetMapping("/get-limits")
	public Limit getLimits()
	{
		return new Limit(props.getMinimum(),props.getMaximum());
	}
}
