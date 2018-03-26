package com.test.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.mvc.service.IncrementService;
/**
 * Rest Controller class
 * @author Kishore
 *
 */
@RestController
public class IncrementController {

	@Autowired
	private IncrementService incrementService;

	/**
	 * Get method to call database update statement
	 * @return string
	 */
	@GetMapping("/increment")
	public String increment() {
		incrementService.increment();
		return "value incremented";
	}

}
