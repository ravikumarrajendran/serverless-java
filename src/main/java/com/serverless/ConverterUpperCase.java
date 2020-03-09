package com.serverless;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class ConverterUpperCase implements Function<String,String>{

	@Override
	public String apply(String t) {
		// TODO Auto-generated method stub
		return t.toUpperCase();
	}

	
}
