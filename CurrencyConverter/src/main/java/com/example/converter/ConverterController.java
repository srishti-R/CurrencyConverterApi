package com.example.converter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

	public ConverterController() {}
	
	@GetMapping
	@ResponseBody
	ConvertedValue getRupeeValue(@RequestBody QueryObject obj) {
		double factor= Constants.getConversionFactor(obj);
		return new ConvertedValue("value", obj.value*factor);
	}
	
	
}
