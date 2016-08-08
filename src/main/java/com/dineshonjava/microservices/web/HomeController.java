/**
 * 
 */
package com.dineshonjava.microservices.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}

}
